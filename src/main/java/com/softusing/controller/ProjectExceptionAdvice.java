package com.softusing.controller;

import com.softusing.exception.BusinessException;
import com.softusing.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//define an exception class,this anno already include @ResponseBody and @Component
@RestControllerAdvice//TODO Need this class change to a bean can be autowired by springboot
public class ProjectExceptionAdvice {
    //here we return a formatted result to front end
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //record log
        //notice staff
        //notice programmer
        /**
         * exception from controller offered the three args to system exception constructor
         * so that we can invoke them here by the way under
         */
        return new Result(null,ex.getCode(),ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){

        return new Result(null,ex.getCode(),ex.getMessage());
    }

    //also need a method for others exception
    @ExceptionHandler(Exception.class)
    public Result doOthersException(Exception ex){
        //record log
        //notice staff
        //notice programmer
        return new Result(null,Code.SYSTEM_UNKNOWN_ERR,"System busy, retry late please");
    }
}
