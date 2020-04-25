package com.tasks.策略模式.工厂策略;

public enum FruitEnum {
    apple("com.tasks.策略模式.工厂策略.Apple"),
    orange("com.tasks.策略模式.工厂策略.Orange");
    private String value;
    private FruitEnum(String value){
        this.value=value;
    }
    public String getValue(){
        return this.value;
    }
}
