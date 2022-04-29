package com.simplilearn.datatype.package2;
class defspecifir
{
	void display()//avaiable with in same package
	{
		System.out.println("You are using dafault access specifier");
	}
	}
  class defprispecifir
{
	 private void display()//only with in class
	{
		System.out.println("You are using private access specifier");
	}
	}
  class defprotspecifir
{
	 protected void display()//protected available with in same package and also inheritane class.
	{
		System.out.println("You are using dafault access specifier");
	}
	}
public class accessmodifier {
	public static void main(String[] args)
	{//default            
		System.out.println("Default access modifier");
		defspecifir obj1=new defspecifir();//object for default access modifier.
		obj1.display();
		
		System.out.println("Private access modifier");
		defprispecifir obj2=new defprispecifir();//object for private access modifier.
		//obj2.display();
		
		System.out.println("Protected access modifier");
		defprotspecifir obj3=new defprotspecifir();//object for protected access modifier.
		obj3.display();
	}

}
 