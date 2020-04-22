package com.bruce.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable, Cloneable {

	public String name;
	public DeepCloneabeTarget deepCloneabeTarget;

	public DeepPrototype() {
		super();
	}

	// 深拷贝 方式1 使用clone方法
	@Override
	protected Object clone() {
		Object deep = null;

		try {
			deep = super.clone();

			DeepPrototype deepPrototype = (DeepPrototype) deep;
			deepPrototype.deepCloneabeTarget = (DeepCloneabeTarget) deepCloneabeTarget.clone();

			return deepPrototype;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	// 深拷贝 - 方式2 通过对象的序列化实现 推荐
	public Object deepClone() {
		///创建对象
		ByteArrayOutputStream  bos=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream  ois=null;
		try {
			//序列化
			bos=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(bos);
			oos.writeObject(this);
			//反序列化
			bis=new ByteArrayInputStream(bos.toByteArray());
			ois=new ObjectInputStream(bis);
			DeepPrototype copyObj=(DeepPrototype)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getStackTrace());
			}
			
		}
		
	}
}
