package com.pearadmin.plugin.configure.sequence;

import com.pearadmin.plugin.framework.sequence.SequenceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 分 布 式 Id 自 动 配 置 --【就眠仪式】
 */
@Slf4j
@Configuration
@ConditionalOnClass(SequenceFactory.class)
@EnableConfigurationProperties(SequenceAutoProperties.class)
public class SequenceAutoConfiguration {

    /**
     * 引 用 映 射 配 置 属 性
     */
    @Resource
    private SequenceAutoProperties sequenceAutoProperties;

    /**
     * 初 始 化 分 布 式 Id 工 厂,并 交 由 Spring IOC 托 管
     */
    @Bean
    public SequenceFactory sequenceFactory() {
        log.info("初 始 化 分 布 式 ID 工 厂");
        log.info("工 作 编 号 : " + sequenceAutoProperties.getWorkerId());
        log.info("数 据 中 心 : " + sequenceAutoProperties.getDataCenterId());
        return new SequenceFactory(sequenceAutoProperties.getWorkerId(), sequenceAutoProperties.getDataCenterId());
    }

}
