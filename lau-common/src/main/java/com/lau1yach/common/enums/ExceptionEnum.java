package com.lau1yach.common.enums;

import lombok.*;

/**
 * @author lyhpl
 * @Title: ExceptionEnums
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/21  10:19
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {
    /**
     *
     */
    BRAND_NOT_FOUND(400,"品牌没查到!"),
    CATEGORY_NOT_FOUND(404,"商品分类没查到!"),
    BRAND_SAVE_ERROR(500,"品牌新增失败!"),
    CATEGORY_BRAND_SAVE_ERROR(500,"品牌分类新增失败!"),
    UPLOAD_FILE_ERROR(500,"文件上传失败!"),
    INVALID_FILE_TYPE(500,"无效的文件类型!"),
    ;
    private int code;
    private String msg;
}
