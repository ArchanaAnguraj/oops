package ONLINEVDOS;
//Polymorphsim is nothing but many forms.
//class Plane{	
//    void disp()
//    {
//    	System.out.println("Plane fly");
//    }
//}
//class CargoPlane extends Plane
//{
//	@Override
//  void disp()
//  {
//	  System.out.println("CargoPlane flies at low height");
//  }
//}
//class PassengerPlane extends Plane
//{
//	@Override
//	void disp()
//	  {
//		  System.out.println("PassengerPlane flies at medium height");
//	  }
//}
//class FighterPlane extends Plane
//{
//	@Override
//	void disp()
//	  {
//		  System.out.println("FighterPlane flies at high height");
//	  }
//	
//}
//public class PolymorphsimOops {
//
//	public static void main(String[] args) {
//		 Plane ref;                                            //how to achieve polymorphsim - whenever if tight coupling is here ,there is impossible to achieve polymorphsim 
//		CargoPlane c=new CargoPlane();                  //tight coupling-->child object child reference  is known as "tight coupling".
//		                                                //Loose coupling-->child object parent reference  is known as "loose coupling"
//		PassengerPlane p=new PassengerPlane();
//		FighterPlane f=new FighterPlane();
//		ref=c;
//		ref.disp();
//		ref=p;
//		ref.disp();
//		ref=f;                              //1:3--->1:many means polymorphism.
//		ref.disp();
//
//	}
//
//}
//--------------------------------------------------------//
//class Parent{	
//    void disp()
//    {
//    	System.out.println("Parent did't cry");
//    }
//}
//class Child1 extends Parent
//{
//	@Override                                    //override method
//  void disp()
//  {
//	  System.out.println("child1 cries at low voice");
//  }
//	void code()                                  //Specialized method
//	{
//		System.out.println("child1 konws java");
//	}
//	
//}
//class Child2 extends Parent
//{
//	@Override
//	void disp()
//	  {
//		  System.out.println("child2 cries at medium voice");
//	  }
//	void code()                                  //Specialized method
//	{
//		System.out.println("child1 konws c++");
//	}
//	
//}
//class Child3 extends Parent{
//	@Override
//	void disp(){
//		  System.out.println("child3 cries at high voice");
//	  }
//	void code() {                                  //Specialized method
//		System.out.println("child1 konws c");
//	}
//}
//public class PolymorphsimOops {
//   public static void main(String[] args) {
//		Child1 c1=new Child1();
//		Child2 c2=new Child2();
//		Child3 c3=new Child3();
//		Parent res;
//		res=c1;
//		res.disp();
//        ((Child1)(res)).code();//--->is technically called as downcasting--"making a parent ref to behave like a child.Using downcasting we can access specialized method. 
//              //downcasting is nothing but explicit type casting but here we did not convert data type instead we convert objects like parent to child thats why its called downcasting.   
//       
//        res=c2;
//        res.disp();
//        //res.Code(); --->//cannot use for specialized method for polymorphsim because its child object parent ref, in parent class does not have any Specialized method
//        ((Child2) (res)).code();  //  using parent ref cannot access specialized method. Using parent ref we can access override method and inherited method.
//		
//		     
//		res=c3;
//		res.disp();
//		((Child3)(res)).code();
//	
//	}
//}
//------------------------------------------------------------------------------//
//polymorphism

class Plane{	
    void disp(){
  	System.out.println("Plane fly");
  }
}
class CargoPlane extends Plane{
	@Override
void disp()
	{
	  System.out.println("CargoPlane flies at low height");
    }
void Carry()
   {
	System.out.println("carry the things");
   }
	
}
class PassengerPlane extends Plane
{
	@Override
	void disp()
	  {
		  System.out.println("PassengerPlane flies at medium height");
	  }
	void Carry()
	 {
		System.out.println("carry the passenger");
	 }
}
class FighterPlane extends Plane
{
	@Override
	void disp()
	  {
		  System.out.println("FighterPlane flies at high height");
	  }
	void Carry()
	 {
		System.out.println("carry the wepons");
	 }
	
}
class Airport
{
	void disp(Plane ref)     //this code is flexible to all objects is know as code flexible
	
	{                        //In that Airport class does not in uml diagram, we have create one method inside these class have should one parameter,it is compulsory parent ref.
		ref.disp();
	}
}
public class PolymorphsimOops {

	public static void main(String[] args) {
		Plane ref;                                           
		CargoPlane c=new CargoPlane();                  
		PassengerPlane p=new PassengerPlane();
		FighterPlane f=new FighterPlane();
		Airport a=new Airport();
		a.disp(c);
		a.disp(p);
		a.disp(f);
		
	    ref=c;
	    c.Carry();
	    
	}

}
//-------------------------------------------------------------------//

//Down casting and up casting
//Up Casting also known as polymorphism and loose coupling--->child object parent ref....
//1 way--

//Parent ref;
//ref=c1;
//ref.disp();
//----
//2way
//
//Parent ref=new child();
//------------//
//Down casting-->is convert from parent type to child type..((child).(ref)).disp();
//---------------------------------------------------------------------------------------------------------------//
//Complie time polymorphism ------->method overloading is example of complietimepolymorphism------> binding will happen in during compilation by using java compiler.
 //static binding
//early binding                            //its know as compiletime polymorphsim.

//class demo                         
//{
//	disp(int a)
//	{
//		
//		
//	}
//	disp(int a,int b)
//	{
//		
//	}
//	disp(int a,int c,int b)
//	{
//		
//	}
//}
//------------------------//
//Run time polymorphism
//class Parent
//{                    //there is inheritance and polymorphsim,, "method overriding "is ex for runtime poly,binding the method will happen in during runtime by using JVM
//	marry()
//	{
//		System.out.println("married");
//	}
//}
//class child1 extends Parent
//{
//	@Override
//	marry()
//	{
//	System.out.println("vijay");	
//	}
//}
//class child2 extends Parent
//{
//	@Override
//	marry()
//	{
//		System.out.println("samntha");
//	}
//}
//













