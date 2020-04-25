package com.tasks.构建型模式.单例模式;

public class SunSingleton3 {
    private SunSingleton3(){}

    private volatile static SunSingleton3 sun;
    public static SunSingleton3 getInstance(){
        if(sun==null){
            synchronized (SunSingleton3.class){
                if(sun==null){
                    sun=new SunSingleton3();
                }
            }
        }
        return sun;
    }
}
