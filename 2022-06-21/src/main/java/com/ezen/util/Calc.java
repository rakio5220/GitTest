package com.ezen.util;

public class Calc {
	int num1, num2;
	
	public Calc() {
		this(0,0);
	}
	
	public Calc(int x, int y) {
		num1 = x;
		num2 = y;
	}
	int add() {
		return num1+num2;
	}
	int sub() {
		return num1-num2;
	}
	int mul() {
		return num1*num2;
	}
	int div() {
		return num1/num2;
	}
	
	public void getinfo() {
		System.out.printf("두 정수 %d, %d\n", num1, num2);
		System.out.printf("더하기: %d\n", add());
		System.out.printf("빼기기: %d\n", sub());
		System.out.printf("곱하기: %d\n", mul());
		System.out.printf("나누기: %.2f\n", div());

	}
}
