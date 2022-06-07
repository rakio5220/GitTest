/*
 * Nested클래스 와 Inner클래스
 * Nested ==> static
 * 
 * 
 * Inner --> static xx
 * Member inner Class
 * Local inner Class
 * Anonymous inner Class
 * */

class Outer {
	private static int num=0;
	
	static class Nested1 {
		void add(int n) { num += n; }
	}
	
	static class Netsd2 {
		int get() { return num;}
	}
}
public class StaticNested {

	public static void main(String[] args) {
		 Outer.Nested1 nst1 = new  Outer.Nested1();
		 nst1.add(10);
		 Outer.Netsd2 nst2 = new Outer.Netsd2();
		 System.out.println(nst2.get());
	}

}
