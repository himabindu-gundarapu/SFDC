import java.util.Scanner;

public class Solution {
	public static int numberOfSteps(String givenBinaryNumber) {
		int lengthOfString = givenBinaryNumber.length();
		int count =0;
		for(int i =lengthOfString-1;i>0;i--) {
			 if(givenBinaryNumber.charAt(i) == '0') {
				 count++;}
			 else { count+=2;}
		}
			 if(givenBinaryNumber.charAt(0) =='1') {
				 count++;
			 }
		
		return count;
	}
	
	
	

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	
	System.out.println("enter any binary number");
	String numInBinaryForm = input.next();
	int totalStepsCount = numberOfSteps(numInBinaryForm);
	System.out.println(" number of steps = " +totalStepsCount);
	input.close();
	}
	
}
