package CollectionExamples;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static String reverseStr(String str) {
		Stack<Character> s2 = new Stack<>();
		
		char[] chArr = str.toCharArray();
		for(int i =0; i< chArr.length;i++) {
			 s2.push(chArr[i]);
		 
		}
		
		int i=0;
		while (s2.empty() == false) {
			chArr[i] = s2.pop();
			i++;
		}
		
		String op = new String(chArr);
		
		return op;
	}
	
	public static void main(String[] args) {
		 String ip = "himabindu";
		 String op = reverseStr(ip);
		 System.out.println("Reverse of a given string = " + op);	
	}
}
