package com.tasks.构建型模式.简单工厂模式;

public class Main {
    public static void main(String args[]){
        Fruit appleFruit=FruitFactory.getFruit(FruitEnum.Apple);
        appleFruit.plant();
        appleFruit.grow();
        appleFruit.harvest();

        Fruit orangeFruit=FruitFactory.getFruit(FruitEnum.Orange);
        orangeFruit.plant();
        orangeFruit.grow();
        orangeFruit.harvest();
    }
}
