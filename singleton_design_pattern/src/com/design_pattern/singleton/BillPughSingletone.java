package com.design_pattern.singleton;

public class BillPughSingletone {
	
	private BillPughSingletone() {
		super();
	}

	private static class BillPughSingletoneHelper{
		private static final BillPughSingletone BILLPUGH= new BillPughSingletone();
	}
	
	public static BillPughSingletone getInstance() {
		return BillPughSingletoneHelper.BILLPUGH ;
	}

}
