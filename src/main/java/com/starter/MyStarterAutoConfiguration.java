package com.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangwenjun on 2022/12/4 11:15
 */
@Configuration
// EnableConfigurationProperties value数组中的配置类起作用

/**
 *  EnableConfigurationProperties  注解的作用 ： 配合 spring.factory文件
 */
@EnableConfigurationProperties(value = {MyStarterProperties.class})
public class MyStarterAutoConfiguration {
  @Autowired
  private MyStarterProperties myStarterProperties;

  @Bean
  @ConditionalOnMissingBean(MyStarterConfig.class)
  public MyStarterConfig myStarterConfig(){

    /**
     * new  -- 通过 bean注入  中间有个ConditionalOnMissingBean 判断
     */
    return new MyStarterConfig(myStarterProperties);
  }

}
