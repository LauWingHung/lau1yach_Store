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
     * price cannot be null
     */
    BRAND_NOT_FOUND(400,"品牌没查到!"),
    CATEGORY_NOT_FOUND(404,"商品分类没查到!"),
    BRAND_SAVE_ERROR(500,"品牌新增失败!"),
    CATEGORY_BRAND_SAVE_ERROR(500,"品牌分类新增失败!"),
    ;
    private int code;
    private String msg;
}
