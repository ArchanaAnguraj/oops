package ONLINEVDOS;
import java.util.Scanner;
//Interface is used to achieve "abstraction" and also used to "standardization".

//interface Caluculator           //Rule 1-->An interface is like a contract that,when we implemented its helps to achieve standardization
//{                                
//	                          
//	public abstract void add();//--->//Rule 2--> Methods inside the interface ,automatically public and abstract are given by JVM  before method .
//	abstract void sub();       //--- we should give only abstract methods inside the interface 
//}
//
//class Mycalc1 implements  Caluculator 
//{                                              
//	@Override
//	
//	public void add(){               
//	 System.out.println(100+200);	          
//	}
//	@Override
//	public void sub(){
//		System.out.println(100-200);	
//	}
//}
//class Mycalc2 implements  Caluculator
//{
//	@Override
//	public void add(){
//		int a=20;
//		int b=70;
//		System.out.println(a+b);
//	}
//	@Override
//	public void sub(){
//		int a=70;
//		int b=80;
//		System.out.println(a-b);	
//	}
//	void mul()
//	{
//		int a=70;
//		int b=80;
//		System.out.println(a*b);	
//	}
//}
//class Mycalc3 implements  Caluculator
//{
//	@Override
//	public void add(){
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a>b)
//			System.out.println(a+b);
//		else
//			System.out.println("Invaild");
//	}
//	@Override
//	public void sub(){
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a==0||b==0) {
//			System.out.println("Invalid");
//		}
//		else {
//		  System.out.println(a-b);
//		}
//	}
//	public void mul()
//	{
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a==0||b==0) {
//			System.out.println("Invalid");
//		}
//		else {
//		  System.out.println(a*b);
//		}
//		
//	}
//}
//class maths
//{
//	void calc(Caluculator ref)
//	{
//		ref.add();                       //Rule 3-->Interface promote polymorpshim by using Interface ref - child object.
//		ref.sub();                           //this achieving loose coupling ,,code flexibility,reduce code.
//	}
//}
//
//public class InterfaceOops {
//
//	public static void main(String[] args) {
//		 Mycalc1 m1=new  Mycalc1();
//		 Mycalc2 m2=new  Mycalc2();        
//		 Mycalc3 m3=new  Mycalc3();      
//		 maths m= new maths();
//		 Caluculator ref;                 
//		 ref=m1;
//		 ((Mycalc3)(ref)).mul();   //--- Rule 4-->Specialized method cannot access directly by using interface object,but indirectly
//		                                       //we can access the method by using downcasting (child object).
//		 m1.add();
//		 m1.sub();
//		 m2.add();
//		 m2.sub();
//		 m3.add();
//		 m3.sub();

	//}

//}

//------------------------//


interface Caluculator1
{
	abstract void add(); 
	abstract void sub(); 
}

//class Mycalc implements  Caluculator1  //Rule5-->if class partially implements interface,if must declare as abstract.
//{
//	@Override
//	public void add() {                 
//		System.out.println(100+200);
//		
//	}
//}
//------------------------//

interface Caluculator12
{
	 void add(); 
     void sub(); 
}
interface Caluculator2
{
	void add(); 
    void sub(); 
}
class mycalculator implements Caluculator12,Caluculator2 //Rule6-->We can achieve multiple inheritance by using Interface
{                                               //a class can  implement multiple inheritance because diamond shape does not in interface
	@Override                                      //why because it does not have parent ,,but in class parent object there.
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	private void mul() {
		// TODO Auto-generated method stub

	}
	private void div() {
		// TODO Auto-generated method stub

	}
}
//-----------------------------------------------//

//interface Caluculator21
//{
//	 void add();                                 //Rule7-->one interface can not implements another interface but we can "extends"..
//}                                                         //why because interface can not provide methods inside the body..
//interface Caluculator23 implements Caluculator21 //wrong
//{
//	
//}
//interface Caluculator22 extends Caluculator21 //correct
//{
//	void sub();
//}
//class  Caluculator24 implements Caluculator21
//{
//	@Override
//	public void add() {
//		// TODO Auto-generated method stub
//		
//	}
//	private void sub() {
//		// TODO Auto-generated method stub
//
//	}
//}
//------------------------//
interface Caluculator31
{
	 void add(); 
}

interface Caluculator32
{                                                       
	 void sub(); 
}
interface calculator33 extends Caluculator31,Caluculator32  // -->//Rule 8:An interface can extends another interface ,
{                                                              //and its achevied multiple interface because dimand shape problem does not exist.
	                                                          //In java can achieve indirectly by using interface..
	void mul(); 
}
class mycalc implements calculator33                    
{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
}

//---------------------------------------------//

interface Caluculator310
{
	 void add(); 
}

interface Caluculator311
{
	 void add(); 
}
class mycalc5 implements Caluculator310,Caluculator311 
{
    @Override
	public void add() {                                   //only one add method come if you have same name methods...
		System.out.println("only one add method come");
		
	}
	
}

//---------------------------------//

interface Caluculator3101
{
	 void add(); 
	 //void add(); //we cant give duplicate  methods... 
	 void sub(); 
}

class Caluculator3112
{
	 void mul()
	 {
		 
	 }
	 void div()
	 {
		 
	 }
}
class mycalc6 extends Caluculator3112 implements Caluculator3101 //Rule 9:a class extends interface as well as implement interface,,
                                                                      //order should be first give extends and implements..
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
                                                     
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	//balance 2 methos are inherited automaticlay came..
	
}

//----------------------------------//

interface calculator123
{
	int count=9;    //-->//by dafault  attach public,static,final...
	                //Rule10:--An interface contains variables and methods signatures ..its automatticaly attach public,static,final..
}

//class Tap implements calculator123            
//{
//	void disp()
//	{
//		count=8;            //we cant change the value coming frome interface because its final its invisible \..
//		System.out.println(count);
//	}
//}
//public class InterfaceOops {
//	public static void main(String[] args) {
////		Tap t=new Tap();
////		t.disp();
//		System.out.println(Tap.count);       
//		
	//}
//}
//---------------------------------//
interface calculator1231
{
	int count=9;    

}
interface calculator1232
{
	int count=10;    

}
class mycalc7 implements calculator1231,calculator1232
{
	void disp()
	{
		System.out.println( calculator1231.count);
		System.out.println( calculator1232.count);//java get confusion here so we give name of intheface and we can access...	
	}
}

//---------------------------------//

interface demo123
{
	                       //Rule 11: we can give empty interface also called "Marker interface" and "Tagged Interface" ..its uesd to give special properties
}                             //to the object of class..

//Serializable   -->EX for "marker interface"

//-----------------//

//interface Tap1S
//{
//	void add();
//}
//public class InterfaceOops {
//	public static void main(String[] args) {
//		Tap1 t;//Rule 12:we cant create obejct for interfacee but we can craete reference..
//		
//	}
//}
//-----------------------------------------------------------------//

//interface demo
//{
//	void disp1();
//	default void disp2()            //we gan give method body inside the interface by using default...
//	{
//		System.out.println("tap");
//	}
//}

//example
interface SeaAnimalls
{
	void eat();
	void swim();                        
	default void communicate()                  //why java include this feature?  >it will support backword compatibility of our project
	{                                                // what is default method? such a method having the body inside the interface...java8 onwards its came
		System.out.println("communicate");
	}
}
class Shark implements SeaAnimalls{

	@Override
	public void eat() {
		System.out.println("Shark eats humanbeings");
	}

	@Override
	public void swim() {
	 System.out.println("shark swin fast");	         
	}
	@Override
	public void communicate() {
		System.out.println("shark communicates");         //we can override default methods and also inherited
	}
}

class Dolphin implements SeaAnimalls{
    @Override
	public void eat() {
    	System.out.println("Dolphin  eats fishes");
	}

	@Override
	public void swim() {
		System.out.println("dolphin swim beautifully");	
	}	
	
}

//public class InterfaceOops {
//	public static void main(String[] args) {
//		Shark s=new Shark();
//		Dolphin d=new Dolphin();
//		s.eat();
//		s.swim();
//		s.communicate();
//		d.eat();
//		d.swim();
//		d.communicate();
//		System.out.println(d.toString());
//	}
//	}
//-------------------//
interface demo9S
{
	static void disp()                     //if we want access the content directly inside interface we can use static..
	{
		System.out.println("OUTPUT");
	}
}
class dem078 implements demo9S
{
	
}
//public class InterfaceOops {
//	public static void main(String[] args) {
//		//demo9S d;  --error
//		demo9S.disp();
//		//dem078.disp(); //--error              //static method will never inherited and override..
//	}
//}

//----------------------------------------------------------------//
interface Student12
{
	///static
	default void personallifeOfStudent()
	{
		redundanCode();
	}
//static//	
	default void professionallifeOfStudent()
	{
		redundanCode();
	}
	private static void redundanCode()     //this method for only personallifeOfStudent,professionallifeOfStudent that is why we give private..
	{                                                     //we cant give static because everyone usethat,,,default also we cant give because its inherited
		System.out.println("Student wake up with mobile"); //its came from jdk9..
		System.out.println("Student work with mobile"); 
		System.out.println("Student eat up with mobile");
		System.out.println("Student sleep up with mobile");
	}
}


//-------------------------------//
//Functional interface-->Functional interface are such a interface having "Only one abstract" method inside the interface..and 
                             //also give default,static,private,private static methods.
@FunctionalInterface
interface display
{
	void disp();
	default void disp1()
	{
		
	}
//	static void disp3()                     
//	{
//		System.out.println("OUTPUT");
//	}
//	private void disp4()                     
//	{
//		System.out.println("OUTPUT");
//	}
//	private static void disp5()                     
//	{
//		System.out.println("OUTPUT");
//	}
}

//class display1 implements display
//{
//    @Override
//	public void disp() {
//		System.out.println("outer class");   //Implement by using outer class..less security
//		
//	}
//}

public class InterfaceOops {
	public static void main(String[] args) {
//		class display1 implements display
//		{
//		    @Override
//			public void disp() {
//				System.out.println("inner class");   //Implement by using inner class..security
//				
//			}
//		}
//		display1 D=new display1();
//		D.disp();
		
		
//		display d = new display()                  //instead of class we create anonymous class
//		{
//		    @Override
//			public void disp() {
//				System.out.println("Anonymous class");   //Implement by using  anonymous in inner class..more security
//				
//			}
//		};
//		d.disp();
		
		
		display d =()->{System.out.println("lamda expersions");};  //Implement by using lamda expersions ...more security less lines..
		d.disp();                                                    //its implementing only one method its only for functional interface
		
		                                                               
		
		
		
		
		
		
	}
}




