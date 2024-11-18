package com.example.wiki.exception;

import com.example.wiki.common.vo.ResultVO;
import com.mysql.cj.util.StringUtils;
import io.netty.util.internal.StringUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResultVO handlerException(Exception e) {
        return new ResultVO(500, StringUtils.isNullOrEmpty(e.getMessage()) ? "服务器异常" : e.getMessage(), null);
    }
}
