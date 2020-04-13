package com.bruce.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	private Object target;

	public ProxyFactory(Object obj) {
	   
		this.target=obj;
	}
	
	public Object getProxyInstance() {
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK代理开始~~~~~");
				Object retunVal=method.invoke(target, args);
				System.out.println("proxy is on working");
				return retunVal;
			}
		});
	}
	
	
	
	
}
