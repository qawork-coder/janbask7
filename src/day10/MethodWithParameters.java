package day10;

public class MethodWithParameters {

	public void checkEligibility(int age) {

		if (age >= 18) {
			System.out.println("YOu are eligible to vote");
		} else {
			System.out.println("You are not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithParameters obj = new MethodWithParameters(); // For creating an object
		obj.checkEligibility(40); // Calling a method

	}
}
