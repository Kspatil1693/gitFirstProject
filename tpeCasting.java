package com.simplilearn.datatype.package2;

public class tpeCasting {
	public static void main(String[] args)
	{ 
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a is="+a);
		int n=a;
		System.out.println("Value of integer is="+n);
		float f=a;
		System.out.println("Value of float is="+f);
		double d=a;
		System.out.println("Value of double is="+d);
		long l=a;
		System.out.println("Value of long is="+l);
		
		System.out.println("Explicity Type Casting");
		
		double x=45.54;
		int y=(int)x;
		System.out.println("Value of X is="+x);
		System.out.println("Value of Y is="+y);
		
	}

}
