package com.missing9.springframework.bean;

/**
 * @author Kylin
 * @version v1.0
 * @project minisize-spring
 * @date 2021/7/27 0027
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
