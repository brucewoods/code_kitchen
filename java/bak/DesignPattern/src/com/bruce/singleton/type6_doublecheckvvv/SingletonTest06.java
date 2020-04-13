package com.bruce.singleton.type6_doublecheckvvv;

 

public class SingletonTest06 {
	public static void main(String[] args) {
		// todo more logics
		//todo   more logics
		System.out.println("使用静态内部类完成单例模式");
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+".."+s2.hashCode());


	}
}

class Singleton {
   //加关键字 volatile  轻量及synchronized  立即刷新 变值到内存上
	private static volatile Singleton instance;

	private Singleton() {

	}
	//写一个静态内部类,该类有一个静态属性Singleton
	private static class  SingletonInstance{
		private static final Singleton INSTANTCE_SINGLETON=new Singleton();
	}
   //加入双重检查代码,解决线程案例问题,同时解决懒加载问题
	//同时保证〦〧〨效率
	public static synchronized Singleton getInstance() {
		 
	    return SingletonInstance.INSTANTCE_SINGLETON;
	}

}
