package com.bruce.proxy.cglib;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
        TeacherDao target=new TeacherDao();
        
        TeacherDao teacher=(TeacherDao)new ProxyFactory(target).getProxyInstance();
        
        teacher.teach();
	}
}
