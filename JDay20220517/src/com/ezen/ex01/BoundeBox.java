package com.ezen.ex01;

class Box<T extends Number> {
	private T ob;
	
	public void set(T o) {
		
	}
	
	public T get() {
		return ob;
	}
}

class Person{}
public class BoundeBox {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		Box<Long> aBox = new Box<>();
		aBox.set(100L);
		
		System.out.println(aBox.get());
	} 

}
