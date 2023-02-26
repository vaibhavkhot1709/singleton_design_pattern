package com.design_pattern.singleton;

public class ThreadSafeIntialization {

	private static ThreadSafeIntialization tsf;

	private ThreadSafeIntialization() {
		super();
	}

	public synchronized static ThreadSafeIntialization getInstance() {

		if (null == tsf) {
			tsf = new ThreadSafeIntialization();
		}
		return tsf;
	}

//  bcz of this object level lock performance get hamper so use object level lock by using below method

	public static ThreadSafeIntialization getInstanceObject() {

		if (null == tsf) {
			
			synchronized(ThreadSafeIntialization.class) {
				if(tsf==null)
				tsf = new ThreadSafeIntialization();
			}
		}
		return tsf;
	}

}
