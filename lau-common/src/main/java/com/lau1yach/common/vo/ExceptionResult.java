package com.lau1yach.common.vo;

import com.lau1yach.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author lyhpl
 * @Title: ExceptionResult
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/21  10:41
 */
@Data
public class ExceptionResult {

    private int status;

    private String message;

    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
