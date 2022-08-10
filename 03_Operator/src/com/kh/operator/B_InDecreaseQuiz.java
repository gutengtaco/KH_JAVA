package com.kh.operator;

public class B_InDecreaseQuiz {
	
	public void method1() {
	
	int a = 5;				// a=5
	int b = 10;				// b=10
	int c = (++a) + b;		// a=6, c=6+10=16
	int d = c / a;			// d= 16/6 =2
	int e = c % a;			// e= 16%6 =4
	int f = e++;			// f=4, e=5
	int g = (--b) + (d--);	// --b = 9, g= 9+2 =11, d=1
	int h = 2;				// h=2
	// a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2;
	int i = a++ + b / (--c/f) * (g-- - d)%(++e + h);
	
	// int i = 6++ + 9 / (--16/4) * (11-- - 1) % (++5 + 2)
	// int i = 6+9 / (15/4) * (11-1) %(6+2) 
	// 6 + (9/3 *10 % 8)
	// 6 + (3 * 10 % 8) = 6 + (30 % 8) = 6+6 = 12

	// a=7, b=9, c=15, d=1, e=6, f=4, g=10, h=2
	
	System.out.println("int a : "+a);
	System.out.println("int b : "+b);
	System.out.println("int c : "+c);
	System.out.println("int d : "+d);
	System.out.println("int e : "+e);
	System.out.println("int f : "+f);
	System.out.println("int g : "+g);
	System.out.println("int h : "+h);
	System.out.println("int i : "+i);
	}
}	
