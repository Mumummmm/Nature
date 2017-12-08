package com.pansy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    如果你在非web应用环境使用Spring的IOC容器；例如，在一个富桌面客户端环境中，你在JVM中注册一个关闭钩子。这样做确保了妥善
    的关闭，为了释放所有资源需要调用与单例beans相关的析构方法。当然，你仍然必须正确的配置和实现这些销毁回调函数。
    为了注册一个关闭钩子，你可以调用ConfigurableApplicationContext接口中声明的registerShutdownHook方法
 */
public class Boot {
    public static void main(String[] args){
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"Spring.xml"});

        ctx.registerShutdownHook();
    }
}
