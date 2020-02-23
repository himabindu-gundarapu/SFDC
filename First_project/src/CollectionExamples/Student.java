package CollectionExamples;


import java.util.TreeMap;

public class Student {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(56, "vinod");
		tm.put(45, "john");
		tm.put(12, "Anand");
		tm.put(13, "michael");
		tm.put(52, "harsha");
		
		for(String s : tm.values())
		{
			System.out.println(s);
		}
		

		
		
	}
}
