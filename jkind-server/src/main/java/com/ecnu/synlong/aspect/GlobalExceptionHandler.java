package com.ecnu.synlong.aspect;

import com.ecnu.synlong.common.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
    @ExceptionHandler(Exception.class)
    public BaseResponse<String> handleException(Exception e) {
        log.error("捕获到异常: ", e);
        return BaseResponse.error(e.getMessage());
    }
}
