import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueWord {
	public static LinkedHashSet<String> Unique_words_string(String str){
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		String[] str1 = str.split(" ");
		for( String s : str1) {
			lset.add(s);
			
		}
		return lset;
		
	}
	

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		
		System.out.println(" enter any string : ");
		String str = Input.nextLine();
		lset = Unique_words_string(str);
		System.out.println("Unique words in array");
		for(String s : lset) {
			System.out.println(s);
		}
		Input.close();
		
		

	}

}
