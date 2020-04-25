package com.tasks.策略模式.工厂策略;

public class FruitContext {
    private FruitContext(){}

    public static Fruit getFruit(FruitEnum fruitEnum){
        Fruit fruit=null;
        try{
            fruit=(Fruit) Class.forName(fruitEnum.getValue()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}
