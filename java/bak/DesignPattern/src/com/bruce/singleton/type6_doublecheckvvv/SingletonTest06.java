package com.bruce.singleton.type6_doublecheckvvv;

 

public class SingletonTest06 {
	public static void main(String[] args) {
		// todo more logics
		//todo   more logics
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+".."+s2.hashCode());


	}
}

class Singleton {
   //�ӹؼ��� volatile  ������synchronized  ����ˢ�� ��ֵ���ڴ���
	private static volatile Singleton instance;

	private Singleton() {

	}
	//дһ����̬�ڲ���,������һ����̬����Singleton
	private static class  SingletonInstance{
		private static final Singleton INSTANTCE_SINGLETON=new Singleton();
	}
   //����˫�ؼ�����,����̰߳�������,ͬʱ�������������
	//ͬʱ��֤�E�F�GЧ��
	public static synchronized Singleton getInstance() {
		 
	    return SingletonInstance.INSTANTCE_SINGLETON;
	}

}
