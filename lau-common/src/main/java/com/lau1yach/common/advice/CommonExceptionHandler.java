package com.lau1yach.common.advice;

import com.lau1yach.common.enums.ExceptionEnum;
import com.lau1yach.common.exception.LauException;
import com.lau1yach.common.vo.ExceptionResult;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author lyhpl
 * @Title: CommonExceptionHandler
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/21  9:46
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LauException.class)
    public ResponseEntity<ExceptionResult> handleException(LauException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
