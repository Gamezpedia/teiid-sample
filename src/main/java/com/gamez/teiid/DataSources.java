package com.gamez.teiid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration(proxyBeanMethods = false)
public class DataSources {

    @ConfigurationProperties(prefix = "spring.datasource.db")
    @Bean
    public DataSource db() {
        return DataSourceBuilder.create().build();
    }

    //.. REST OF THE SOURCES DOWN BELOW

}
