package com.pearadmin.plugin.framework.pageable.exception;

/**
 * 异 常 类
 * */
public class PageableException extends RuntimeException{

    public PageableException(){ }

    public PageableException(String message){

        super(message);
    }
}
