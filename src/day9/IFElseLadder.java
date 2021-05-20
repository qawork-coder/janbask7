package day9;

public class IFElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String country="US";
		int age=20;
		
		if(age>=18)
		{
			System.out.println("YOu are eligible to vote");
			
			if(country=="US")
			{
				System.out.println("U r eligible");
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		else
		{
			System.out.println("You are not eligible");
		}
		
	}

}
