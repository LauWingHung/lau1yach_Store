package com.lau1yach.upload.service;

import com.lau1yach.common.enums.ExceptionEnum;
import com.lau1yach.common.exception.LauException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

/**
 * @author lyhpl
 * @Title: UploadService
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/26  11:10
 */
@Service
@Slf4j
public class UploadService {

    private static final List<String> ALLOW_TYPE = Arrays.asList("image/jpeg","image/png","image/bmp");

    public String uploadImage(MultipartFile file) {
        try {
            //校验文件
            String contentType = file.getContentType();
            if (!ALLOW_TYPE.contains(contentType)){
                throw new LauException(ExceptionEnum.INVALID_FILE_TYPE);
            }

            //校验文件内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null){
                throw new LauException(ExceptionEnum.INVALID_FILE_TYPE);
            }

            //目标路径
            File dest = new File("D:/JakartaEE/lau1yach/upload/",file.getOriginalFilename());
            //保存文件到本地
            file.transferTo(dest);

            //返回路径
            return "http://image.lau1yach.com"+file.getOriginalFilename();
        } catch (IOException e) {
            //上传失败
            log.error("上传失败!",e);
            throw new LauException(ExceptionEnum.UPLOAD_FILE_ERROR);
        }
    }
}
