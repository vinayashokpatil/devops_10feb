package com.vinay.git.calculator;

public class calculator {

	int a,b;
	int c;
		
	int add() {
		a=20;
		b=30;
		c=a+b;
		return c;		
	}
	
	int sub() {
		a=50;
		b=10;
		c=a-b;
		return c;
		//added a comment
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			calculator calc = new calculator();
			calc.add();
			System.out.println(calc.add());
			System.out.println(calc.sub());
			
	}

}
