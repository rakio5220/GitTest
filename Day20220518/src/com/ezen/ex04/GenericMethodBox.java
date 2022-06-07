package com.ezen.ex04;

class Box<T> {
	private T ob;
	
	public void set(T o) { ob= o; }
	public T get() {return ob;}
}

public class GenericMethodBox {

	public static <T> void swapBox(Box<T> box1, Box<T> box2) {
		
		T temp = box1.get();
		
		box1.set(box2.get());
		
		box2.set(temp);
	
	}
	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		
		Box<Integer> box2 = new Box<>();
		box1.set(55);
		System.out.println("before : " + box1.get() + "&" + box2.get());
		
		swapBox(box1, box2);
		
		System.out.println("afert : " + box1.get() + "&" + box2.get());
		
	}

}

