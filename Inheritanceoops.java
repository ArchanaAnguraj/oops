package ONLINEVDOS;
//class parent1000{
//	String color="Brown";
//	int height=5;
//	void dis() {
//	System.out.print(color);                                 //what is Inheritance?
//	System.out.print(color);                                 //Inheritance the process of acquiring properties and behavior of a class to another class.
//}
//}
//class child1000 extends parent1000{
//	
//}
//public class Inheritanceoops {
//	public static void main(String[] args) {
//		child1000 c=new child1000();
//		c.dis();}
//}
//-------------------------------------------------//

//class Parent1000
//{
//	float h=5.2f;
//	void disp()
//	{
//		System.out.println("My parents are Indian");         //Types of Inheritance
//	}	                                                     //Single level
//}
//class child1000 extends Parent1000
//{
//	
//}
//public class Inheritanceoops {
//	public static void main(String[] args) {
//		child1000 c=new child1000();
//		c.disp();
//		System.out.println(c.h);
//}
//}
//-------------------------------------------------//

//class grantParent1000{
//	float h=5.2f;
//	void disp()
//	{
//		System.out.println("My parents are Indian");         //Types of Inheritance
//	}	                                                     //Multi-level
//}
//class Parent1000 extends grantParent1000{
//	
//}
//class child1000 extends Parent1000{
//	
//}
//public class Inheritanceoops {
//	public static void main(String[] args) {
//		child1000 c=new child1000();
//		c.disp();
//		System.out.println(c.h);
//}
//}
//--------------------------------------------------//

//class parent
//{
//	String s="python";
//	int n=100;
//	 void demo()
//	 {
//		 System.out.println("python is a easy language");
//	 }                                                           //Types of Inheritance
//}                                                              //hirarical-level}
//class child1 extends parent{
//	
//}
//class child2 extends parent{
//	
//}
//class child3 extends parent{
//	
//}
//public class Inheritanceoops {
//   public static void main(String[]args) 
//   {
//	   child1 c1 = new child1();
//	   child2 c2 = new child2();
//	   child3 c3 = new child3();
//	   System.out.println(c1.s);
//	   c1.demo();
//	   System.out.println();
//	   System.out.println(c2.s);
//	   c2.demo();
//	   System.out.println();
//	   System.out.println(c3.n);
//	   c3.demo();
//	  }
//}

//----------------------------------------------------//

//class Grantparent12
//{
//	String s="python";
//	int n=100;
//	 void demo()
//	 {
//		 System.out.println("python is a easy language");
//	 }                                                           //Types of Inheritance
//}                                                               
//hibrid-level---combination of 2 or more inheritance
//class parent extends Grantparent12
//{
//	                                                 
//}
//class child1 extends parent{
//	
//}
//class child2 extends parent{
//	
//}
//class child3 extends parent{
//	
//}
//public class Inheritanceoops {
//   public static void main(String[]args) 
//   {
//	   child1 c1 = new child1();
//	   child2 c2 = new child2();
//	   child3 c3 = new child3();
//	   System.out.println(c1.s);
//	   c1.demo();
//	   System.out.println();
//	   System.out.println(c2.s);
//	   c2.demo();
//	   System.out.println();
//	   System.out.println(c3.n);
//	   c3.demo();
//	  }
//}


//--------------------------------------------------------------//

//class Demo1 //extends object---------------that means programmer does not extends the class , JVM will extends 
//{                                             //"object is parent of every class "
//	int i=9;
//}                                              //"Multiple inheritance"---//one child class is acquiring from multiple parent class does not work
//class Demo2 //extends object
//{
//	int i=99;
//}
//class Demo3 extends Demo1,Demo2  //-----there is no multiple Inheritance and its also called "diamond path"
//{
//	System.out.println(i);
//}
//
//-----------------------//
//class parent extends child
//{
//	
//}
//class child extends parent        //there is no cyclic inheritance
//{
//	
//}
//---------------------------------------------------------------------------//

//"Constructor chaining"
//class grandparent
//{
//	grandparent()
//	{
//		System.out.println("Inside grantparent class");
//	}
//}
//class parent extends grandparent{
//     parent()
//     {
//    	 System.out.println("Inside parent class");
//     }
//}
//class child extends parent{
//	child()                                                    //calling a constructor from one class to another class
//	{
//		//super();      -----//if programmer did not give super() java will give default   
//		 System.out.println("Inside child class");
//	}
//}
//public class Inheritanceoops {
//     public static void main(String[]args) {
//    	 child c=new child();
//    }
//}
//-------------------------------------------------------------------//

//--example
//class Grantparent{
//	Grantparent(){
//		System.out.println("Inside the grantparent class");
//	}
//	Grantparent(float b){
//		this();
//		System.out.println("Inside the grantparent param 1 class");	
//	}
//}
//class Parents123 extends Grantparent{
//	Parents123(){
//	   super(1.3f);
//		System.out.println("Inside the parent class");
//	}
//	Parents123(String s){
//	    this();
//		System.out.println("Inside the parent param 1 class");
//	}
//}
//class child extends Parents123{
//	child(){
//		super("TAP");
//		System.out.println("Inside the child class");
//     }
//   child(int a){
//	   this();                                               //the first statement of constructor  either super nor this
//		 System.out.print("Inside the child class 1 param");
//}
//}
//public class Inheritanceoops {
//  public static void main(String[] args) {
//		child c=new child(100);
//		}
//  }

//--------------------------------------------------------------------//
//class You
//{
//   private int pw=8080;
//   private int an=12345;                          // 1.   private members cannot inheritance its only support for encapsulation
//}                    
//class Hacker extends You
//{
//	void disp() {
//	 pw=8089;
//	 an=89766;
//	System.out.println(pw);
//	}
//}
////------//
//class parent
//{
//	parent()
//	{
//	   System.out.println("inside parent");        //2.  constructor cannot inheritance but it will executed,,,,then how output same like?
//	}                                                    // its not because of inheritance ,because of using super keyword
//}
//class child extends parent
//{
//	child()
//	{
//		//super();
//		System.out.println("inside child");
//	}
//}
//public class Inheritanceoops {
//   public static void main(String[] args) {
//      Hacker h=new Hacker();
//      h.disp();
//   }
//}
//-----------------------------------------------------------------------------------------------------------------------//
//"Types of method in Inheritance"
class plane{
	void takeOff()
	{
		System.out.println("plane is takeOff");
	}
	void fly()
	{
	System.out.println("plane is flies");	
	}
	void land()
	{
		System.out.println("plane is land");
	}
}
class cargoplane extends plane{
	void fly()
	{
		System.out.println("plane flies at low higth");      //------------------Override method
	}
	void carryCargo()
	{
		System.out.println("plane carry cargo");             //------------------specialized method
	}
}
class Passengerplane extends plane{
	void fly()
	{
		System.out.println("plane flies at medium higth");   //------------------Override method
	}
	void carrypassenger()
	{
		System.out.println("plane carry passenger");         //------------------specialized method
	}
}
class fighterPlane extends plane{
	void fly()
	{
		System.out.println("plane flies at high higth"); //------------------Override method
	}
	void carryarms()
	{
		System.out.println("plane carry arms");          //------------------specialized method
	}
}

public class Inheritanceoops {
   public static void main(String[] args){
	   cargoplane c=new cargoplane();
	   Passengerplane p=new Passengerplane();
	   fighterPlane f=new fighterPlane();
	   c.takeOff();                                            //Pascal conversion its for class
	   c.fly();                                                   //ex-DemoDemo
	   c.land();                                               //Camelcase conversion its for variables,methods
	   c.carryCargo();                                            //ex-demoDemo
	   p.takeOff();                                            //Snake conversion its for constant variables
	   p.fly();                                                    //ex--DEMO_DEMO
	   p.land();
	   p.carrypassenger();                                    //kebab conversion its not use in java
	   f.takeOff();                                                //demo-demo
	                                                          //reverse Internet domain conversion
	   f.fly();                                                    //com.tap.package its use for package
	   f.land();
	   f.carryarms();
	   }
  }
//---------------------------------------------------------------------//
//"Overridden Rules"

// class Test
//{
//	public int a;                         //"Access modifier"---public,private,protected,default
//    private int b;                           //given to the----variables,methods,class,constructor
//	protected int c;
//	int d;
//	public void disp() {
//		
//	}
//	public Test() {
//		
//	}
//}
//--------------------//
//class Parent{
//  public void disp() {
//	  System.out.println("I read books");
//  }
//}
//class child extends Parent{
//	@Override
//	  void disp() {                               //rule1 : when ever override the method we can keep the same access modifier or else  we can increase the visibility not decrease
//		  System.out.println("I read java books");
//	  }
//}
//---------------------//
//class Parent{
//  public void disp() {
//	  System.out.println("I read books");
//  }
//}
//class child extends Parent
//{
//	@Override
//	 public int disp() {                  //<------------//rule2 : We can not change the primitive return type of override method.
//		  System.out.println("I read java books");
//	  }
//}

//-----------------//
//class Animal{
//	
//}
//class tiger extends Animal{
//	
//}
//class Parent{
//   Animal disp() {
//	   Animal a=new Animal();
//	  System.out.println("I read books");
//	  return a;
//  }
//}                             //rule3: if we want to change the return type of override method ,yes we can change but override method and its parent 
//class child extends Parent                                                      //method having inheritance relationship this is called co-variant{
//	@Override
//	tiger disp() {  
//		tiger t=new tiger();
//		  System.out.println("I read java books");
//		  return t;
//	  }
//}
//----------------------//
//class Parent{
//  public void disp() {
//	  System.out.println("I read books");
// }
//}
//class child extends Parent{
//	@Override
//	  public void disp(int a,int b) {     //rule4 : we can not change the number of parameters  override method
//		  System.out.println("I read java books");
//	}
//}

//-----------------------------------------------------------------------------------------------------------//
//class Parent
//{
//	static void disp()
//	{
//		System.out.println("inside parent");
//	}
//}
//class Child extends Parent                  //static can be Inheritance..
//{
//	
//}
//public class Inheritanceoops {
//  public static void main(String[] args){
//       Child.disp();
//  }
//}
//-------------//
//class Parent
//{
//	static void disp()
//	{
//		System.out.println("inside parent");
//	}
//}
//class Child extends Parent   {               
//	             //static cannot be override....,,,,if we did not give @Override label its work...why?because its get hidden method if(same parametrs)else
//	@Override                                        //its specialized method
//	static void disp(int a,int b)                         //this method class is method hiding
//	{
//		System.out.println("inside child");
//	}
//}
//public class Inheritanceoops {
//  public static void main(String[] args){
//       Child.disp();
//       Child.disp(10,29);
//  }}

//------------------------------------//






