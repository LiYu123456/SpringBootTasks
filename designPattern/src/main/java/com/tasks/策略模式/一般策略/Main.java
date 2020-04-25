package com.tasks.策略模式.一般策略;

public class Main {
    public static void main(String args[]){
        FruitContext context=new FruitContext(new Orange());
        context.plant();
    }
}
