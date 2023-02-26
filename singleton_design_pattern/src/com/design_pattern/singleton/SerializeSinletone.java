package com.design_pattern.singleton;

import java.io.Serializable;

public class SerializeSinletone implements Serializable{


	private static final long serialVersionUID = -9211545820391021745L;

	
	private SerializeSinletone() {
		super();
	}


	private static class SingletonHelper{
		private static final SerializeSinletone instance=new SerializeSinletone();
		
	}
	public static SerializeSinletone getInstance() {
		
		return SingletonHelper.instance;
	}

	public Object readResolve() {
		return SerializeSinletone.getInstance();
	}
}
