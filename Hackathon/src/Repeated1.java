import java.util.HashSet;
import java.util.Scanner;

public class Repeated1 {
	public static HashSet<Character> Repeated(String str){
		char[] ch = str.toCharArray();
		HashSet< Character> hs = new HashSet<>();
		HashSet< Character> hs1 = new HashSet<>();
		for( Character c : ch) {
			if((hs.contains(c)) && (!hs1.contains(c))){			
					hs1.add(c);
			}
			hs.add(c);
			}
		return hs1;
	}
		
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" Enter any string : ");
		String str = Input.next();
		HashSet< Character> hs = new HashSet<>();
		
		hs = Repeated(str);
		System.out.println(hs);
		Input.close();		
		int numIntegers=0;
		int numLowercase=0;
		int numUppercase=0;
		
		for (Character ch: hs) {
			if (Character.isDigit(ch)) { numIntegers++; }
			if (Character.isLowerCase(ch)) { numLowercase++; }
			if (Character.isUpperCase(ch)) { numUppercase++; }
		}
		
		System.out.println("Number of repeated integers = " + numIntegers);
		System.out.println("Number of repeated lower case letters = " + numLowercase);
		System.out.println("Number of repeated integers = " + numUppercase);

	}

}
