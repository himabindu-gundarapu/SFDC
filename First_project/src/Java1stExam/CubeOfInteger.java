package Java1stExam;
import java.util.*;

public class CubeOfInteger {
	public static void Cube_of_givenNumber(int number) {
		int result;
		if(number == 0) {
			System.out.println("0");
		}
		for( int i = 1; i<=number;i++) {
			result = i*i*i;
			System.out.println("Number is:" +i +"cube of "+i+ " is " +result);
			}
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter number of terms : ");
		int num = Input.nextInt();
		Cube_of_givenNumber(num);

		Input.close();
	}

}
