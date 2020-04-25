package com.tasks.构建型模式.抽象工厂模式;

public class Main {
    public static void main(String args[]){
        AbstractFactory appleFactory=new AppleFactory();
        Juice appleJuice=appleFactory.createJuice();
        Pie applePie=appleFactory.createPie();
        appleJuice.drink();
        applePie.eat();

        AbstractFactory orangeFactory=new OrangeFactory();
        Juice orangeJuice=orangeFactory.createJuice();
        Pie orangePie=orangeFactory.createPie();
        orangeJuice.drink();
        orangePie.eat();
    }
}
