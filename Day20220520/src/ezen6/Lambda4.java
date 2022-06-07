package ezen6;

interface Printable4 { void print(String s); }

interface Calculate {
	void cal(int n1, int n2);
}

class Cal implements Calculate {
	
	public void cal(int n1, int n2) {
		System.out.println(n1+n2);
	}
}//ctrl + shift + {
public class Lambda4 {
	public static void main(String[] args) {
		Printable4 prn;
		
		prn = (String s) -> { System.out.println(s); };
		prn.print("java is lambda1");
		
		prn = (String s) -> System.out.println(s) ;
		prn.print("java is lambda2");
		
		prn = (s) -> System.out.println(s) ;
		prn.print("java is lambda3");
		
		prn = s -> System.out.println(s) ;
		prn.print("java is lambda");
		
		Calculate c = new Cal();
		c.cal(10, 10);
		
		Calculate cc;
		cc = (int n1, int n2) -> {
			System.out.println(n1+n2);
		};
		
		cc.cal(5, 2);
	}

}
