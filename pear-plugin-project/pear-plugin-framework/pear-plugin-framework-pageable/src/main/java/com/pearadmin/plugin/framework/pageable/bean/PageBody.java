package com.pearadmin.plugin.framework.pageable.bean;

import lombok.Data;

import java.util.List;

/**
 * Page Response Data 分页返回数据 -- [就眠仪式]
 * */
@Data
public class PageBody<T> {

    /**
     * 实 际 数 据 列 表
     * */
    private List<T> data;

    /**
     * 当 前 页
     * */
    private long page;

    /**
     * 每 页 显 示 的 数 量
     * */
    private long pageSize;

    /**
     * 总 数 据 量
     * */
    private long total;

}
