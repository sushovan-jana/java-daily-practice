package com.kodewala.day15.practice;

interface interf1 {
	void m1();
	void m2();
}
// Inside interface by default methods are public abstract whether we declare or not
// compulosry we should declare them as public.
// if not providing implementation for all classes then we should declare class a abstract
abstract class ServiceProvider1 implements interf1 {
	public void m1() {
		System.out.println("Hello");
	}
}

class SubServiceProvider extends ServiceProvider1 {
	
	public void m2() {
		
		System.out.println("Sub Service Provider");
	}
}