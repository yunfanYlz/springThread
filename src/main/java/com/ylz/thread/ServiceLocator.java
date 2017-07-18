package com.ylz.thread;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Use the static class to handle the config info of App Service.
 * 
 */
public class ServiceLocator implements ApplicationContextAware {

    public static ApplicationContext ctx;

    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        ServiceLocator.ctx = ctx;
    }

    public static Object getBean(String beanName) {
        return ctx.getBean(beanName);
    }
}
