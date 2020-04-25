package com.tasks.构建型模式.抽象工厂模式;

public class AppleFactory implements AbstractFactory {
    @Override
    public Juice createJuice() {
        return new AppleJuice();
    }

    @Override
    public Pie createPie() {
        return new ApplePie();
    }
}
