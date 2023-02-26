package com.design_pattern.singleton;

public class StaticBlockIntialization {

	private static StaticBlockIntialization sbe1;

	private StaticBlockIntialization() {
		super();
	}

	static {

		try {
			sbe1 = new StaticBlockIntialization();
		} catch (Exception e) {
			System.out.println("exception occure ");
			e.printStackTrace();
		}

	}

	public static StaticBlockIntialization getInstance() {

		return sbe1;
	}

}
