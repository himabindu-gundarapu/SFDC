import java.util.Scanner;

public class ReverseString {
	public static char[] RevString(String str) {
		char[] cArr = str.toCharArray();
		char[] RevArr = new char[str.length()];
		int len = cArr.length;
		int j =0;
		for(int  i = len-1; i>=0;i--) {
			
			RevArr[j] = cArr[i];
			j++;
		
		}
		 return RevArr;
	}
	

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = Input.nextLine();
		 char[] RevArr;
		 RevArr = RevString(str);
		 System.out.println(RevArr);
		 Input.close();
	}

}
