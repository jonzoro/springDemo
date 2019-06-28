package com.demo;

import org.springframework.stereotype.Component;

/**
 * 模拟Spring Bean
 */
@Component
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hello " + name);
    }
}
