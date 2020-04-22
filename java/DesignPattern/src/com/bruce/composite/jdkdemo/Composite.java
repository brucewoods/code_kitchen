package com.bruce.composite.jdkdemo;

import java.util.HashMap;
import java.util.Map;

public class Composite {
	public static void main(String[] args) {
		//todo   more logics
Map<Integer, String> hashMap=new HashMap<Integer, String>();
hashMap.put(0, "ÀÏ»¢");
Map<Integer, String> map=new HashMap<Integer, String>();
map.put(1,"Ê¨×Ó");
map.put(2,"±ª×Ó");
hashMap.putAll(map);
System.out.println(hashMap);

	}
}
