package ezen7;

interface Printable4 { void print(String s); }

interface Calculate {
	int cal(int n1, int n2);
}

class Cal implements Calculate {
	
	public int cal(int n1, int n2) {
		return n1+n2;
	}
}//ctrl + shift + {
public class Lambda4 {
	public static void main(String[] args) {
		
		
		Calculate c = (int n1, int n2) -> {
						return n1+n2;
		};
		
		System.out.println(c.cal(5, 2));
		
		c = (n1, n2) ->  n1+n2;
		
		System.out.println(c.cal(5, 9));
		
		c = (n1,n2) -> n1*n2;
		System.out.println(c.cal(5, 9));
		
	}

}
