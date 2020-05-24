package com.pearadmin.plugin.sample.sequence.controller;

import com.pearadmin.plugin.framework.sequence.SequenceFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("sequence")
public class SequenceController {

    @Resource
    private SequenceFactory sequenceFactory;

    @GetMapping("genId")
    public String genId(){

        for (int i = 0;i<10;i++
             ) {

            System.out.println(" 序 列 Id :" + sequenceFactory.genId());

        }

        return "访问成功";
    }
}
