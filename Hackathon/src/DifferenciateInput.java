import java.util.Scanner;

public class DifferenciateInput {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter input string ");
		String str = Input.next();
		 if( Character.isDigit(str.charAt(0))){
			 System.out.println(" given input is Integer");
		 }
			 
 	 	if(Boolean.parseBoolean(str)) {
			 	System.out.println(" given character is boolean");
		 }
 	 	else {
 	 		 
 				 System.out.println(" given input is String");
 	 	}
		 Input.close();
	}

}
