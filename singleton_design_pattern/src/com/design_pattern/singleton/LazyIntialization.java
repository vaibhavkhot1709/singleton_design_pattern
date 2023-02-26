package com.design_pattern.singleton;

public class LazyIntialization {

	private static LazyIntialization lz;
	
	
	private LazyIntialization() {
		super();
	}


	public static LazyIntialization getInstance() {
		if(lz==null)
		{
			lz=new LazyIntialization();
		}
		
		return lz;
	}

}
