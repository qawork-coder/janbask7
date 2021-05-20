package day10;

public class SimpleFunction {
	// Method has to be created in the class body

	public void checkEligibility() {

		int age=2;
		if (age >= 18) {
			System.out.println("YOu are eligible to vote");
		} else {
			System.out.println("You are not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleFunction obj = new SimpleFunction(); // For creating an object
		obj.checkEligibility(); // Calling a method

	}

}
