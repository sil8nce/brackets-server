package org.datayoo.brackets.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author BLADE
 * @Date 2021/4/7 0:06
 * @Version 1.0
 **/
public class BaseController {

  protected static final Logger logger = LoggerFactory
      .getLogger(BaseController.class);

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Throwable.class)
  @ResponseBody
  protected final ErrorInfo baseExceptionHander(HttpServletRequest req,
      Throwable throwable) {
    logger.error("Controller error...", throwable);
    return new ErrorInfo(HttpStatus.INTERNAL_SERVER_ERROR.value(),
        throwable.getClass().getName(), throwable.getMessage(), new Date());
  }

  protected final <T> ResponseEntity<T> ok(T object) {
    return new ResponseEntity<>(object, HttpStatus.OK);
  }

  protected final <T> ResponseEntity<T> ok(T object, HttpHeaders headers) {
    return new ResponseEntity<>(object, HttpStatus.OK);
  }

  protected final ResponseEntity<Void> v() {
    return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
  }

  private class ErrorInfo {
    public int code;
    public String exception;
    public String message;
    public Date date;

    public ErrorInfo(int code, String exception, String message, Date date) {
      this.code = code;
      this.exception = exception;
      this.message = message;
      this.date = date;
    }
  }
}
