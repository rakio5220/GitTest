package com.ezen.ex02;

class Box<T> {
	private T ob;
	
	public void set(T o) { ob= o; }
	public T get() {return ob;}
}

class UnBoxer {
	public static <T> T makeBox(Box<T> box) {
		
		return box.get();
	}
}
public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		sBox.set("Generic Method");
		
		String str = UnBoxer.makeBox(sBox);
		System.out.println(str);

	}

}

