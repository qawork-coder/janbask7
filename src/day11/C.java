package day11;

public class C extends B{

	public void methodC()
	{
		System.out.println("I belong to Class C");
	}
	
	public static void main(String args[])
	{
		
		C obj=new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
	
}
