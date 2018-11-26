package com.lau1yach.common.exception;

import com.lau1yach.common.enums.ExceptionEnum;
import lombok.*;

/**
 * @author lyhpl
 * @Title: LauException
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/21  10:32
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LauException extends RuntimeException{

    private ExceptionEnum exceptionEnum;


}
