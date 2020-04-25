package com.tasks.构建型模式.抽象工厂模式;

public class OrangeFactory implements AbstractFactory {
    @Override
    public Juice createJuice() {
        return new OrangeJuice();
    }

    @Override
    public Pie createPie() {
        return new OrangePie();
    }
}
