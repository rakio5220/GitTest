package com.ezen.ex11;

class  Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Toy {
	
	@Override
	public String toString() {
		return "I am Toy";				
	}
}

//public static void out(Box<? extends Toy> box)
class Robot extends Toy {}
class BoxHandler {											//box전달 대상은 Toy, Robot 가능
	public static void out(Box<? extends Toy> box) { //box에 전달 가능 인스턴스는 Toy 또는 Toy상속 가능한 아이들 
		Toy t = box.getOb();  //box >> Box<Toy> or Box<robot>
		System.out.println(t);
		//box.setOb(t);
	}
	
	public static void inBox(Box<? super Toy> box, Toy t) { //box 대상은 Toy, Object
		box.setOb(t); //Toy
		
		//Toy t2 = box.getOb();
		//System.out.println(t2);
	}
}
public class BoundedWildCardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.out(box);
		
	}

}
