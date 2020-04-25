package com.tasks.策略模式.一般策略;

public class FruitContext {
    private Fruit fruit;
    public FruitContext(Fruit fruit){
        this.fruit=fruit;
    }

    public void plant(){
        fruit.plant();
    }
}
