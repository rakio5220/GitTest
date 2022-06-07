package com.ezen.ex04;


class Box<T> {
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T t) { ob = t;}		
}

public class GenericInheritance {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new SteelBox(7959);
		
		Box<String> sBox = new SteelBox("simple");
		
		System.out.println(iBox.getOb());
		System.out.println(sBox.getOb());
	}

}
