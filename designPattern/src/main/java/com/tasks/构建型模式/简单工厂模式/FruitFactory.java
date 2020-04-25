package com.tasks.构建型模式.简单工厂模式;

public class FruitFactory {
    private FruitFactory(){}

    public static Fruit getFruit(FruitEnum fruitEnum){
        Fruit fruit=null;
        switch(fruitEnum){
            case Apple: fruit=new Apple();break;
            case Orange: fruit=new Orange();break;
        }
        return fruit;
    }
}
