import java.util.HashMap;
import java.util.Scanner;

public class Repeated_Dig {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" Enter any String :");
		String str =Input.next();
		char[]chArr = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		HashMap<Character,Integer> resultHm = new HashMap<>();

		for(char c : chArr) {
			if(hm.containsKey(c)) {
				if(!resultHm.containsKey(c)){
					resultHm.put(c, 1);
				}
			}
			hm.put(c, 1);
		}
		
			for(Character i : resultHm.keySet()) {
				System.out.println(i);
			}
		Input.close();
		
		
	}

}
