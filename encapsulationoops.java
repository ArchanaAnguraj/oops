package ONLINEVDOS;
import java.util.Scanner;


//class HumanBrain{
//	private String heart;
//    private String brain;
//	
//    public void setter(String x,String y)
//   {
//	  heart=x;
//	  brain=y;
//   }
//    public String getter()
//    {
//    	return brain;
//    }
//    public String getter1()
//    {
//    	return heart;
//    }
//}
 
//class Bank{ 
//	private int salary;
//	private String Name;
//	private String city;
//	
//	void getter(int x,String y,String z)
//	{
//	  salary=x;
//     	city=z;
//		Name=y;
//		   
//}
//	int setter()
//	{
//		return salary;
//	}
//	String setter1()
//	{
//		return Name;
//	}
//	String setter2()
//	{
//		return city;
//	}
//	
//}
//class Bank{
//	private int an;
//	private int pw;
//	public int getAn() {
//		return an;
//	}
//	public void setAn(int an) {
//		this.an = an;
//	}
//	public int getPw() {
//		return pw;
//	}
//	public void setPw(int pw) {
//		this.pw = pw;
//	}
//}
//class Student{
//	String name;;
//	int age;
//	Student(String name,int age)
//	{
//		this();
//	this.name=name;
//	this.age=age;
//	}
//	Student()
//	{
//		System.out.println("zero parameter");
//	}
//	public String getName() {
//		return name;
//	}
//	public int getAge() {
//		return age;
//class Dog{
//	private String name;
//	private int age;
//	Dog(String name,int age) {
//		this(4);
//	this.name=name;
//	this.age=age;
//	}
//	Dog(){
//	this("blacky",3);
//	System.out.println("zero param");
//	}
//	Dog(int age){
//		this.age=age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public String getName() {
//		return name;
//	}}
class Customer{
	private int id;
	private String  name;
	private long num;
	private int age;
	private String adder;
	public String getAdder() {
		return adder;
	}
	public void setAdder(String adder) {
		this.adder = adder;
	}
	Customer()
	{
	 System.out.println("construstor");	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
class encapsulationoops{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("Enetr the ID:");
		c.setId(s.nextInt());
		System.out.println("Enetr the name:");
		c.setName(s.next());
		System.out.println("Enter the address:");
		s.nextLine();
		c.setAdder(s.nextLine());
		s.nextLine();
		System.out.println("Enter the age:");
		c.setAge(s.nextInt());
		Customer []arr=new Customer[1];
		arr[0]=c;
		System.out.print(arr[0].getId()+" "+arr[0].getName()+" "+arr[0].getAdder()+" "+arr[0].getAge());
		
		
		
	}}
