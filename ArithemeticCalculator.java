package com.simplilearn.datatype.package2;
import java.util.Scanner;
class Calculator
{
	void Operation()
	{
	Scanner sc= new Scanner(System.in);
	int add,sub,mul,div,modul;
	System.out.println("Enter the number Num1 and num2 is");
			int num1=sc.nextInt();
	 int num2=sc.nextInt();
	 System.out.println("please select the operation to be performed\n"
	 		+ "1.Addition\n"
			 +"2.Substraction\n"
			 + "3.Multification\n"
			 + "4.Division\n"
			 + "5.Module\n"
			 + "6.Exit");
			 int n= sc.nextInt();
			 
	 	 if(n==1)
		  {
	 		 add=num1+num2;
		  	 System.out.println("Addition is=" +add);
		  }
	 	 else if(n==2)
	 	 {
	       sub=num1-num2;
	       System.out.println("Substration is=" +sub);
	 	 }
	 	 else if(n==3)
	 	 { 
	       mul=num1*num2;
	      System.out.println("Multipication is=" +mul);
	 	 }
	 	 else if(n==4)
	 	 {
	        div=num1/num2;
	      System.out.println("Division is=" +div);
	 	 }
	 	 else if(n==5)
	 	 { 
	      modul=num1%num2;
	     System.out.println("Module is=" +modul);
	 	 }
	 	 else {
	 		 System.exit(0);
	 	 }
	
	}
}


public class ArithemeticCalculator {
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		for(;;)//infinite loop
		{
			c.Operation();
		}
		
	}

}
