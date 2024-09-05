package ONLINEVDOS;

import java.util.Scanner;

//Abstraction is nothing but hiding the implementation and showing the essential function. 
//how we can achieve abstraction by using 2 ways.abstract,interface.....
//1.abstract--its keyword
abstract class demo
{
	  abstract void disp(); //----  its method signature... 
	  abstract void disp1();        //who are having only method signature does not have method body is called "abstract method."
	  abstract void disp2();        //Who are having the abstract method inside the class is called "abstract class".  
	                                //we can create multiple abstract methods inside the class.
}
//public class AbstractionOops {
 public static void main(String[] args) {
	  demo d=new demo();Error//------------->cannot create object for abstract class ..why? because its incomplete, java doesn't create incomplete class.
		   
}}
//---------------------------------------------------//
//1.---
void disp()
{
	//method body                 //its a complete method so its called "concrete method" or "complete method".
}
//2.---
abstract void disp(); //method signature -----its incomplete method so its called "abstract method."
//---------------------------------------------------//


abstract class demo1{
	demo1(){
		System.out.println("Inside demo1 cost");       //we can inheritance abstract class  
	}
}
class demo2 extends demo1{
	demo2(){
		System.out.println("Inside demo2 cost");        //we can give constructor in abstract class why because,to support the constructor chaining
		}
}

public class AbstractionOops {
	  public static void main(String[] args) {
		  demo2 d=new demo2();
	  }
}
----------------------------------------------------------------------//
//
//class demo
//{
//  abstract int a; //--->we can''t give abstract for instance variables.
//  abstract static int b; //--->we can''t give abstract for static variables.
//	void disp()
//	{
//		abstract int a; //--->we can''t give abstract for local variables.
//	}
//}
//public class AbstractionOops {
//	  public static void main(String[] args) {
//		  demo abstract d=new demo(); //--->we can''t give abstract for reference variables.
//	  }
//}
////-------------//
//
// class demo1{
//	demo1(){
//		System.out.println("Inside demo1 cost");       
//	}
//}
// demo2 extends demo1{
//  abstract void demo2();  //--------we can't give abstract for constructor why because support the constructor chaining.
// }
		
//----------------------------------------------------------------------------------------------------//
	//Example 1:
abstract class Bird{
	abstract void fly();
	abstract void eat();
}
abstract class Eagle extends Bird
{
	@Override
     void fly() {
		System.out.println("Eagle flyies at higher hight");
	}
}
class GoldenEagle extends Eagle
{
	@Override
	void eat() {
		System.out.println("GoldenEagle eats fish");
	}
}
class SerpentEagle extends Eagle
{
	@Override
	void eat() {
		System.out.println("SerpentEagle eats snakes");
	}
}
class Birdfamily
{
	void family(Eagle ref)  //-------------we can give all parent class
	{
		ref.fly();
		ref.eat();
	}
}
public class AbstractionOops {
	  public static void main(String[] args) {
		  GoldenEagle g=new GoldenEagle(); //child object child reference so its tight bond so no polymorphism
		  SerpentEagle s=new SerpentEagle();
		  g.eat();
		  g.fly();
		  s.eat();
		  s.fly();
		  Birdfamily b=new Birdfamily();   //there is polymorphism  --child object parent reference
		  b.family(s);
	  }
}
// 
////--------------------------------------------------------------------------------------//
// 
//final abstract class Demo  //------we can't give final and abstract put together.
//{                                   //why because if we give final keyword we can't inherited that class its fixed.
//	abstract void demo();        //but coming to abstract we want to inherited for complete the class,but if we give final does not work.
//	 
//}                               //same for method ,,if we have abstract method down we can override for complete the method java allow to this, but if give final does not work.
// class demo1 extends Demo
// {
//	 @Override
//	 void demo()
//	 {
//		 System.out.println("haii");
//	 }
//}
// 


 
//------------------------------------------------------------------------------------------------// 
 
 //Example 2:
abstract class Shape{
	float area;
	abstract void acceptInput();          //Abstraction--->only method signature (incomplete method)
	abstract void calcArea();
	void display() {
		System.out.println("The area is"+area);
}
}
class Square extends Shape{               //Inheritance-->extends the class
		private float side;               //Encapsulation -->giving security and access that important data
		
		@Override
		void acceptInput(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the side:");
			side=sc.nextFloat();
		}
		@Override
		void calcArea(){
			area=side*side;
		}
}
class Rectangle extends Shape{
	private float length;
	private float bredth;
   @Override
	void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		length=sc.nextFloat();
		System.out.println("Enter the breadth:");
		bredth=sc.nextFloat();
	}
	@Override
	void calcArea(){
		area=length*bredth;
	}
}
class Circle extends Shape{
 private float radius;
 @Override
 void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=sc.nextFloat();
	}
  @Override
	void calcArea(){
		area=radius*radius*3.14f;
	}}
class Maths{
	void geomentry(Shape ref){
		ref.acceptInput();    //-->code flexibility(Polymorphsim)
		ref.calcArea();
		ref.display();
	}}
public class AbstractionOops {
	  public static void main(String[] args) {
		  Square s=new Square();
		  Rectangle r=new Rectangle();
		  Circle c=new Circle();
		  Maths m=new Maths();
		  m.geomentry(s);
		  m.geomentry(r);
		  m.geomentry(c);

		  
		  Shape ref;
		  ref=s;
		  ref.acceptInput();
		  ref.calcArea();
		  ref.display();
		  
		  
	  }
}
	

 
 
 
 
 
 
 
 
 




