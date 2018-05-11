package com.bootstrap.banksy.config;

import com.bootstrap.banksy.utils.SnowflakeIdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @Bean
    public SnowflakeIdWorker idWorker(){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker();
        return idWorker;
    }
}
