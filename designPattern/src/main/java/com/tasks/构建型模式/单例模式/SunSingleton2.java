package com.tasks.构建型模式.单例模式;

public class SunSingleton2 {
    private SunSingleton2(){}

    private volatile static SunSingleton2 sun;
    public synchronized static SunSingleton2 getInstance(){
        if(sun==null){
            sun=new SunSingleton2();
        }
        return sun;
    }
}
