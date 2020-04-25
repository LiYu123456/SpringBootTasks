package com.tasks.构建型模式.单例模式;

public class SunSingleton4 {
    private SunSingleton4(){}

    private static class SunSingle4Handler{
        private static SunSingleton4 sun=new SunSingleton4();
    }
    public static SunSingleton4 getInstance(){
        return SunSingle4Handler.sun;
    }
}
