package com.bruce.decorater.jdkdemo;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Decorater {
	public static void main(String[] args) throws Exception {
		// todo more logics
		DataInputStream dis = new DataInputStream(new FileInputStream("d:\\1.txt"));

		System.out.println(dis.read());
		dis.close();
	}
}
