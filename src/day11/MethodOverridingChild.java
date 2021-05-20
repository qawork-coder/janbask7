package day11;

public class MethodOverridingChild extends MethodOverridingParent {

	public void printData()
	{
		System.out.println("I am a method child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverridingChild obj=new MethodOverridingChild();
		obj.printData();
		
	}

}
