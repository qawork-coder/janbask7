package day9;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		System.out.println((b>a)&&(c<d));//T&T = T
		System.out.println((b>a)&&(c>d));//T&F=F
		
		//OR Condition
		
		System.out.println((b>a)||(c<d));//T|T=T
		System.out.println((b>a)||(c>d));//T|F=T
		
		//Not operator (!) - whatever the output will be , i will make it the opp
		
		System.out.println(!((b>a)||(c<d)));//!(T|T)=F
		
	}

}
