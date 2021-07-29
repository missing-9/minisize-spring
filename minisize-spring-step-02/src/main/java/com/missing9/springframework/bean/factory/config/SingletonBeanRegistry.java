package com.missing9.springframework.bean.factory.config;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/27 0027
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
