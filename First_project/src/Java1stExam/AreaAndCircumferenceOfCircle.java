package Java1stExam;
import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
	public static double AreaOfCircle(double radius) {
		double area;
		area = 3.14*radius*radius;
		return area;
	}
	public static double CircumferenceOfCircle(double radius) {
		double circumference;
		circumference = 2*3.14*radius;
		return circumference;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius of a circle:");
		double radius = input.nextDouble();
		System.out.println("Area of a circle:" +AreaOfCircle(radius));
		System.out.println("Circumference of a circle is :" +CircumferenceOfCircle( radius));
		
		input.close();
	}

}
