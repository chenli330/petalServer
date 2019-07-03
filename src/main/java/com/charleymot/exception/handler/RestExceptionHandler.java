package com.charleymot.exception.handler;


import com.charleymot.exception.UniteException;
import com.charleymot.util.Dict;
import com.charleymot.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * 统一异常处理
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
@Slf4j
public class RestExceptionHandler {

    @ExceptionHandler
    @ResponseStatus
    public Result runtimeSQLExceptionHandler(SQLException e) {
        log.error("sql异常: ", e);
        return new Result.Builder().setCode(Dict.ATP_SYSTEM_BUSY).setMessage(Dict.MESSAGE_ATP_SYSTEM_BUSY).builder();
    }

    @ExceptionHandler
    @ResponseStatus
    public Result runtimeRuntimeExceptionHandler(RuntimeException e) {
        log.error("运行时异常: ", e);
        return new Result.Builder().setCode(Dict.ATP_SYSTEM_BUSY).setMessage(Dict.MESSAGE_ATP_SYSTEM_BUSY).builder();
    }

    @ExceptionHandler
    @ResponseStatus
    public Result runtimeUniteExceptionHandler(UniteException e) {
        log.error("已捕获的异常: ", e);
        return new Result.Builder().setCode(e.getCode()).setMessage(e.getMessage()).builder();
    }
}
