package com.pearadmin.plugin.framework.pageable.annotation;

import java.lang.annotation.*;

/**
 * Pageable Annotation 分 页 注 解 -- [分页注解]
 * */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Pageable {

    /**
     * 当前页, 默认为 1
     * 没传 page 时, 会使用这个值作为 pageSize
     * */
    int page() default 1;

    /**
     * 当前页面显示的数量, 不屑默认为 10
     * 没传 pageSize 参数时, 则会被强制限制为这个值
     * */
    int pageSize() default 10;

    /**
     * 分页最小限制, 不写默认值为 1
     * 如果 pageSize 大于这个值, 会被强制限制为这个值
     * */
    int min() default 1;

    /**
     * 分页最大限制, 不写默认为 100
     * 如果 pageSize 大于这个值, 会被强制限制为这个值
     * */
    int max() default 100;

}
