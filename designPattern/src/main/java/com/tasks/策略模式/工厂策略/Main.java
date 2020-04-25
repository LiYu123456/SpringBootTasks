package com.tasks.策略模式.工厂策略;

public class Main {
    public static void main(String args[]){
        Fruit fruit=FruitContext.getFruit(FruitEnum.orange);
        fruit.plant();
    }
}
