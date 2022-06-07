package ezen3;


interface Printable {
	void print();
}

class Papers {
	
	private String con;
	public Papers(String s) {con = s;}
	
	
	public Printable getPrinter() {
		
		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}
		}
		
		return new Printable() {  //익명클래스의 정의와 인스턴스 생성
			public void print() {
				System.out.println(con);
			
			}
		};	
	}
}

public class LocalClass1 {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter(); //
		prn.print();
	}

}
