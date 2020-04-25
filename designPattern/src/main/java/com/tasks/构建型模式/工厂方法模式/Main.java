package com.tasks.构建型模式.工厂方法模式;

public class Main {
    public static void main(String args[]){
        Fruit apple=FruitFactory.getApple();
        apple.plant();
        apple.grow();
        apple.harvest();

        Fruit orange=FruitFactory.getOrange();
        orange.plant();
        orange.grow();
        orange.harvest();
    }
}
