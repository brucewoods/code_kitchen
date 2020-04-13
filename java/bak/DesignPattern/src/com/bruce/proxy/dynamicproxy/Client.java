package com.bruce.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		 ITeacherDao target=new TeacherDao();
		 
	 ITeacherDao proxy=(ITeacherDao)new ProxyFactory(target).getProxyInstance();
	 System.out.println("proxyInstance="+proxy.getClass());
	 
	 proxy.teach();

	}
}
