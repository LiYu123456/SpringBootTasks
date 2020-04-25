package com.tasks.构建型模式.建造者模式;

public class AHouseBuilder extends AbstarctHouseBuilder {
    @Override
    public void groundBuild() {
        System.out.println("工人A----开始建地平");
    }

    @Override
    public void wallBuild() {
        System.out.println("工人A----开始建墙壁");
    }

    @Override
    public void roofBuild() {
        System.out.println("工人A----开始建屋顶");
    }

    @Override
    public void windowBuild() {
        System.out.println("工人A----开始建窗子");
    }

    @Override
    public void doorBuild() {
        System.out.println("工人A----开始建门");
    }

    @Override
    public void gardenBuild() {
        System.out.println("工人A----开始建花园");
    }
}
