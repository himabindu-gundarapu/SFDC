import java.util.Scanner;

public class RemoveGivenChar {
	public static char[] RemoveDuplicate(String s, char ch) {
		char[] chArr = s.toCharArray();
		 char[] result = new char[chArr.length];
		 for( int i =0; i< chArr.length;i++) {
			 if( chArr[i] != ch) {
				 result[i] = chArr[i];
			 }
		 }
		 return result;
	
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter any string ");
		String str = Input.nextLine();
		System.out.println(" enter charcter to remove : ");
		char ch = Input.next().charAt(0);
		char[] Result = RemoveDuplicate(str,ch);
		for( int i =0; i<Result.length;i++) {
			System.out.print(Result[i]);
		}
		Input.close();
		
		

	}

}
