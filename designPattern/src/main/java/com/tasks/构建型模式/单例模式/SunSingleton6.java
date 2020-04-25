package com.tasks.构建型模式.单例模式;

/**
 * 有线程安全问题
 */
public class SunSingleton6 {
    private SunSingleton6(){}

    private static SunSingleton6 sun;
    public static SunSingleton6 getInstance(){
        if(sun==null){
           sun=new SunSingleton6();
        }
        return sun;
    }
}
