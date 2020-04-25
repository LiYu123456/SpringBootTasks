package com.tasks.构建型模式.工厂方法模式;

import lombok.Data;

@Data
public class Apple implements Fruit {
    private String name;

    @Override
    public void plant() {
        System.out.println("种植苹果...");
    }

    @Override
    public void grow() {
        System.out.println("苹果生长...");
    }

    @Override
    public void harvest() {
        System.out.println("苹果收获...");
    }
}
