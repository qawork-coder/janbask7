package day9;

public class CompoundIFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country = "US";
		int age = 20;

		if ((age >= 18) && (country == "US")) {
			System.out.println("YOu are eligible to vote");

		} else {
			System.out.println("You are not eligible");
		}

	}

}
