import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfCharacters {
	public static HashMap<Character, Integer> Occurence_of_Characters(String str){
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] cArr = str.toCharArray();
		
		int value;
		for( int i =0 ; i < cArr.length; i++) {
			value = 0;
			if (hm.get(cArr[i]) != null) {
				value = hm.get(cArr[i]);
			}
			hm.put(cArr[i], value+1);
			
		}
		return hm;
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = Input.nextLine();
		HashMap<Character, Integer> hm = new HashMap<>();
		hm = Occurence_of_Characters(str);
		int value;
		for(Character s : hm.keySet()){
			value = hm.get(s);
			System.out.println(s + " occures : " + value  + "times");
		}
		
		Input.close();

	}

}
