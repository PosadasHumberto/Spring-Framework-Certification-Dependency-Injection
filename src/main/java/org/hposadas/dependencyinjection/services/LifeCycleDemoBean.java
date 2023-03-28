package org.hposadas.dependencyinjection.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.hposadas.dependencyinjection.controllers.MyControllerForLyfeCycleBean;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements
        InitializingBean,
        DisposableBean,
        BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        BeanPostProcessor
{

    //atributos
    private String javaVer;

    //constructor
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the CifeCycleBean Constructor ##");
    }

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer){
        this.javaVer = javaVer;
        System.out.println("## 1 Properties Set. Java Ver: " + this.javaVer);
    }

    @Override
    public void setBeanName(String name){
        System.out.println("## 2 BeanNameAware My Bean Name is: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("## 3 BeanFactory Aware - Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
        System.out.println("## 4 ApplicationContextAware - Application Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 5 postConstruct The post Construct annotated method has been called");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("## 6 afterPropertiesSet Populate Properties The LyfeCycleBean has its properties set!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## 7 The @PreDestroy annotated method has been called");
    }

    @Override
    public void destroy(){
        System.out.println("## 8 DisposableBean.destroy The LyfeCycle bean has been terminated");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("## postProcessBeforeInitialization: " + beanName);

        if (bean instanceof MyControllerForLyfeCycleBean){
            MyControllerForLyfeCycleBean myController = (MyControllerForLyfeCycleBean) bean;
            System.out.println("Calling before init");
            myController.beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("## postProcessAfterInitialization: " + beanName);

        if (bean instanceof MyControllerForLyfeCycleBean){
            MyControllerForLyfeCycleBean myController = (MyControllerForLyfeCycleBean) bean;
            System.out.println("Calling after init");
            myController.afterInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
