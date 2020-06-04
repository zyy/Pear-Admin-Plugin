package com.pearadmin.plugin.framework.pageable.aspect;

import com.github.pagehelper.PageHelper;
import com.pearadmin.plugin.framework.pageable.annotation.Pageable;
import lombok.NonNull;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Pageable Aspect 切面
 * */
@Aspect
@Component
public class PageableAspect {


    /**
     * 环绕所有带注解的 Request Handler
     * */
    @Around("@annotation(com.pearadmin.plugin.framework.pageable.annotation.Pageable)")
    public Object aroundHandler(){

        return null;
    }

    /**
     * 前置处理, 进行分页配置
     * */
    private boolean preHandler(@NonNull Pageable pageable){

        PageHelper.clearPage();




        return true;
    }

}
