package com.design_pattern.singleton;

public class EagerInitialization {

	private static EagerInitialization eager = new EagerInitialization();

	private EagerInitialization() {
		super();
	}

	public static EagerInitialization getInstance() {

		if (null == eager) {
			eager = new EagerInitialization();
		}
		return eager;
	}

}

/*
drawback >>>>
              we can not handle exception if occure
              object get created you used it or not
              memory waste
        

*/