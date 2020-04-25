package com.tasks.构建型模式.单例模式;

public class SunSingleton1 {
    private SunSingleton1(){}

    private static SunSingleton1 sun=new SunSingleton1();
    public static SunSingleton1 getInstance(){
        return sun;
    }
}
