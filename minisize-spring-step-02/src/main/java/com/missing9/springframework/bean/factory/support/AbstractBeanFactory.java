package com.missing9.springframework.bean.factory.support;

import com.missing9.springframework.bean.BeansException;
import com.missing9.springframework.bean.factory.BeanFactory;
import com.missing9.springframework.bean.factory.config.BeanDefinition;
import com.missing9.springframework.bean.factory.config.DefaultSingletonBeanRegistry;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/27 0027
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getDeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getDeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
