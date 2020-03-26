package com.bruce.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory  implements MethodInterceptor {
 
	private Object target;
	
	public ProxyFactory(Object target) {
		 
		this.target = target;
	}
	
	public Object getProxyInstance() {
		//创建工具类
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		
		enhancer.setCallback(this);
		return  enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("cglib代理模式开始~~~~~~");
		Object returnVal=method.invoke(target, args);
		
		
		
		
		return returnVal;
	}
 
	
}
