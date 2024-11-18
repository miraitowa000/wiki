package com.example.wiki.exception;

import com.example.wiki.common.vo.ResultVO;
import com.mysql.cj.util.StringUtils;
import io.netty.util.internal.StringUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResultVO> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        ResultVO resultVO = new ResultVO(400, "验证失败", errors);
        return new ResponseEntity<>(resultVO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResultVO> handleException(Exception e) {
        String message = (e.getMessage() == null || e.getMessage().isEmpty()) ? "服务器异常" : e.getMessage();
        ResultVO resultVO = new ResultVO(500, message, null);
        return new ResponseEntity<>(resultVO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
