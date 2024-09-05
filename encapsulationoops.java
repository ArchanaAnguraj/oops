package ONLINEVDOS;
import java.util.Scanner;



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
