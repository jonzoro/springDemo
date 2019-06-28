package com.demo;

/**
 * 入口类
 */
public class MainApp {

    public static void main(String[] args) {
        SpringUtil.setApplicationContext();
        HelloWorld helloWorld = SpringUtil.getBean(HelloWorld.class);
        helloWorld.setName("Spring");
        helloWorld.sayHi();
    }
}
