package com.ezen.ex01;

/*
 * E : Element
 * K : Key
 * N : Numbrt
 * T : Type
 * V : Value
 *  
 * */
class DBox<L,R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + "&" + right;
	}
}

public class MutiTypeParam {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20);
		System.out.println(box);
	}

}
