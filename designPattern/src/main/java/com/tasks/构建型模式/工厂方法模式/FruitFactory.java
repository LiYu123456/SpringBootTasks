package com.tasks.构建型模式.工厂方法模式;

public class FruitFactory {
    private FruitFactory(){}

    public static Fruit getApple(){
        return new Apple();
    }

    public static Fruit getOrange(){
        return new Orange();
    }
}
