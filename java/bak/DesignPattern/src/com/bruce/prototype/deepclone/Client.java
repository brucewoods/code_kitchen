package com.bruce.prototype.deepclone;

public class Client {
	public static void main(String[] args) {
		DeepPrototype deepPrototype = new DeepPrototype();
		deepPrototype.name = "jim";
		deepPrototype.deepCloneabeTarget = new DeepCloneabeTarget("god", "class of god");

//   clone完成深拷贝..
		// DeepPrototype  deepPrototype2=(DeepPrototype) deepPrototype.clone();
//		

		 //序列化完成 .
		DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepClone();
		System.out.println(
				"O1:name=" + deepPrototype.name + "clonetarget:" + deepPrototype.deepCloneabeTarget.hashCode());
		System.out.println(
				"O2:name=" + deepPrototype2.name + "clonetarget:" + deepPrototype2.deepCloneabeTarget.hashCode());

	}
}
