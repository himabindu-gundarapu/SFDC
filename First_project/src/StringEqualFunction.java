
public class StringEqualFunction {
	public static void main(String[] args) {
		String str1="java"; // literal  
		String str2="java";  
		String s1 = new String("Java");// with new keyword  
		String s2 = new String("Java");// with new keyword  

		System.out.println(str1.equals(str2));  
		System.out.println(str1==str2);  
		System.out.println(s1.equals(s2));  
		System.out.println(s1==s2);
}
}