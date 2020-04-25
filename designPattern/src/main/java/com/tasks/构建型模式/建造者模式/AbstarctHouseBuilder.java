package com.tasks.构建型模式.建造者模式;

public abstract class AbstarctHouseBuilder implements HouseBuilder{
    private House house=new House();
    public House getHouse(){
        return house;
    }
}
