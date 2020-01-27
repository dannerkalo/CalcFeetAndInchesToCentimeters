package calcfeetandinchestocentimeters;

public class CalcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//playing with method Overloading
		// calcFeetAndInchesToCentimeters(7,5);
		calcFeetAndInchesToCentimeters(5);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println("centimeters = " + centimeters + "cm");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {

		if (inches < 0) {
			return -1;
		}

		double feet = (int) (inches / 12);
		System.out.println("feet => " + feet);
		double remainingInches = (int) (inches % 12);
		System.out.println("remainingInches => " + remainingInches);
		return calcFeetAndInchesToCentimeters(feet, inches);
	}

}
