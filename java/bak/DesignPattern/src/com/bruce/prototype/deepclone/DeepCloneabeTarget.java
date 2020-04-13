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

  //因为该类的属性 都是String,因此我们这里用默认的clone即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
 