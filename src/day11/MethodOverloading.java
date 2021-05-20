package day11;

public class MethodOverloading {

	public void sum()
	{
		System.out.println("Sum");
	}
	
	public void sum(int a)
	{
		System.out.println(a);
	}
	
	public void sum(int a ,int b)
	{
		System.out.println(a+b);
	}
		
	public void sum(double a ,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10, 20);
		obj.sum(10.2, 20);
		obj.sum(10);
		
	}

}
