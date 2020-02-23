
package Java1stExam;
import java.util.Scanner;


public class CheckBooleanVariables {
	  public  static boolean Is_check( boolean b1, boolean b2,boolean b3) {
		
		boolean result = false;
			if( b1 == true) {
				if( (b2 == true) || (b3 == true) )
				{
					result = b1;
				}
			}
		else if(b2 == true) {
				if(b1 == true || b3 == true) {
					result =b2;
				}
		}
		else if (b3 == true) {
			if(b1 == true || b2 == true) {
				result = b3;
			}
		}
		return result;
	  
		
	}
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter  a,b,c value:");
		boolean a = Input.nextBoolean();
		boolean b = Input.nextBoolean();
		boolean c = Input.nextBoolean();
		boolean result = false;
				result = Is_check(a,b,c);
				if(result == true) {
					System.out.println("two of three variables are true");
				}
				else {
					System.out.println("false");
				}
		Input.close();
		
	}
}
