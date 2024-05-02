package com.example.movie.movieapp.Exception;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(AppRuntimeException.class)
    @ResponseBody
    public ErrorInfo handleAppRuntimeException(AppRuntimeException ex){
        log.error("error while processing request: ", ex);
        String errorMessage = ex.getMessage();
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setMessage(errorMessage);
        return errorInfo;
    }

}
