package com.missing9.springframework.bean.factory;

import com.missing9.springframework.bean.BeansException;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/29
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
