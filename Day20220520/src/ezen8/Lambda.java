package ezen8;

import java.util.function.Function;

public class Lambda {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("java Function"));
		
		System.out.println(f.apply("java"));

	}

}
