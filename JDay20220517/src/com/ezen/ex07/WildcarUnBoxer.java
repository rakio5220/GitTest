package com.ezen.ex07;

class  Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob=ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
				//<T> 생략가능
	public static <T> void peekBox(Box<?> box) { //와일드카드 기반 메소드 정의
		System.out.println(box);
	}
}
public class WildcarUnBoxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		Unboxer.peekBox(box);

	}

}
