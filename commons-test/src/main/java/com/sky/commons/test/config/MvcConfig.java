package com.sky.commons.test.config;

import com.sky.commons.web.context.ApplicationContextUtils;
import com.sky.commons.web.context.ResponseBodyWrapFactoryBean;
import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by redding on 4/2/17.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    ApplicationContextUtils applicationContextUtils(){return new ApplicationContextUtils();}

    @Bean
    ResponseBodyWrapFactoryBean responseBodyWrapFactoryBean(){return new ResponseBodyWrapFactoryBean();}

    @Bean
    LocalValidatorFactoryBean getLocalValidatorFactoryBean(){
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setProviderClass(HibernateValidator.class);
        return localValidatorFactoryBean;
    }

}

