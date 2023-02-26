package com.design_pattern.singleton;

public class TestOfSingletoneDP {

	public static void main(String[] args) {

//  1). EagerInitialization		

		EagerInitialization e1 = EagerInitialization.getInstance();
		EagerInitialization e2 = EagerInitialization.getInstance();
		System.out.println(" EagerInitialization : " + (e1 == e2));

// =============================================================================		

//  2). StaticBlockIntialization

		StaticBlockIntialization sb = StaticBlockIntialization.getInstance();
		StaticBlockIntialization sb2 = StaticBlockIntialization.getInstance();
		System.out.println("\n StaticBlockIntialization : " + (sb == sb2));

// =============================================================================		

//  3). LazyIntialization

		LazyIntialization lz1 = LazyIntialization.getInstance();
		LazyIntialization lz2 = LazyIntialization.getInstance();
		System.out.println("\n LazyIntialization : " + (lz1 == lz2));

// =============================================================================		

//4).ThreadSafe

//  4.1).ThreadSafe by synchronized method

		ThreadSafeIntialization ts1 = ThreadSafeIntialization.getInstance();
		ThreadSafeIntialization ts2 = ThreadSafeIntialization.getInstance();
		System.out.println("\n ThreadSafeIntialization  by synchronized method: " + (ts1 == ts2));

//  4.2).ThreadSafe by synchronized  block 

		ThreadSafeIntialization ts3 = ThreadSafeIntialization.getInstanceObject();
		ThreadSafeIntialization ts4 = ThreadSafeIntialization.getInstanceObject();
		System.out.println("\n ThreadSafeIntialization by synchronized  block : " + (ts3 == ts4));
// =============================================================================		

//  5).Bill Pugh Singletone

		BillPughSingletone bpg1 = BillPughSingletone.getInstance();
		BillPughSingletone bpg2 = BillPughSingletone.getInstance();
		System.out.println("\n BillPughSingletone : " + (bpg1 == bpg2));

// =============================================================================		

//  6).EnumSingleton

		EnumSingleton enm1 = EnumSingleton.INSTANCE;
		EnumSingleton enm2 = EnumSingleton.INSTANCE;
		System.out.println("\n EnumSingleton : " + (enm1 == enm2));

// =============================================================================		

//  7).SerializeSinletone

//		refer SerializeSingltone and its test class

// =============================================================================		

	}
}
