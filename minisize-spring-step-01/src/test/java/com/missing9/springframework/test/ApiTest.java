package com.missing9.springframework.test;

import com.missing9.springframework.BeanDefinition;
import com.missing9.springframework.BeanFactory;
import com.missing9.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/26 0026
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory=new BeanFactory();

        BeanDefinition beanDefinition=new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService=(UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
