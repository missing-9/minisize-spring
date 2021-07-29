package com.missing9.springframework.bean.factory.config;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/27 0027
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass=beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
