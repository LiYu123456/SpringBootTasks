package com.tasks.构建型模式.建造者模式;

public interface HouseBuilder {
    /**
     * 建造地基
     */
    void groundBuild();

    /**
     * 建造墙面
     */
    void wallBuild();

    /**
     * 建造屋顶
     */
    void roofBuild();

    /**
     * 建造窗户
     */
    void windowBuild();

    /**
     * 建造门
     */
    void doorBuild();

    /**
     * 建造花园
     */
    void gardenBuild();
}
