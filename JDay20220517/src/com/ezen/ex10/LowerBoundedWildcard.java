package com.ezen.ex10;

class  Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	
				//<T> 생략가능
	public static <T> void peekBox(Box<? super Integer> box) { //Integer Number Object
		System.out.println(box);
	}
}
public class LowerBoundedWildcard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(100);
		Unboxer.peekBox(box);
		
		Box<Number> box2 = new Box<>();
		box2.setOb(11.5);
		Unboxer.peekBox(box2);
		
		Box<Object> box3 = new Box<>();
		box3.setOb("string");
		Unboxer.peekBox(box3);
	}

}
