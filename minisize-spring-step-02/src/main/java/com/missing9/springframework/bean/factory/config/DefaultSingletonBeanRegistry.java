package com.missing9.springframework.bean.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/29
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{

    private Map<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }
}
