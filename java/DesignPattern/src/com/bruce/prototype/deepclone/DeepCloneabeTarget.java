package com.bruce.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneabeTarget implements Serializable,Cloneable {
 
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String cloneName;
	private String cloneClass;
	

	public DeepCloneabeTarget(String cloneName, String cloneClass) {
		super();
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

  //��Ϊ��������� ����String,�������������Ĭ�ϵ�clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
 