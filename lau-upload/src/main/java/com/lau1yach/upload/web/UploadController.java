package com.lau1yach.upload.web;

import com.lau1yach.upload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lyhpl
 * @Title: UploadContrroller
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/26  11:01
 */
@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;
    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file){
        return ResponseEntity.ok(uploadService.uploadImage(file));
    }
}
