import java.util.Scanner;

public class REvStrWords {
	public static String Reverse_StringWords(String str)
	{
		String[] str2 = str.split(" ");
		StringBuffer  revString = new StringBuffer();
		for(int i =str2.length-1; i>=0;i--)
		{
			revString.append(str2[i]);
			if( i!=0) {
			revString.append(" ");}
		}
		String result = revString.toString();
		return result;
	}

		


	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = Input.nextLine();
		String str2 = Reverse_StringWords(str);
		System.out.println(" reverse of words in given string  :" +str2);
		Input.close();
	}

}
