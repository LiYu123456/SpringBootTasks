package com.tasks.构建型模式.工厂方法模式;

import lombok.Data;

@Data
public class Orange implements Fruit {
    private String name;

    @Override
    public void plant() {
        System.out.println("种植橘子...");
    }

    @Override
    public void grow() {
        System.out.println("橘子生长...");
    }

    @Override
    public void harvest() {
        System.out.println("橘子收获...");
    }
}
