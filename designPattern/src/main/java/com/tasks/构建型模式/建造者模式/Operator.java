package com.tasks.构建型模式.建造者模式;

public class Operator {
    private AbstarctHouseBuilder abstarctHouseBuilder;
    public Operator(AbstarctHouseBuilder abstarctHouseBuilder){
        this.abstarctHouseBuilder=abstarctHouseBuilder;
    }
    public House build(){
        this.abstarctHouseBuilder.groundBuild();
        this.abstarctHouseBuilder.wallBuild();
        this.abstarctHouseBuilder.roofBuild();
        this.abstarctHouseBuilder.doorBuild();
        this.abstarctHouseBuilder.windowBuild();
        return this.abstarctHouseBuilder.getHouse();
    }
}
