import java.util.HashMap;
import java.util.Scanner;

public class UniqueArray {
	public static HashMap<Integer,Integer> Unique_Array(int [] array){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for( int i =0; i< array.length;i++) {
			int value =0;
			if( hm.get(array[i])!=null)
			{
				value = hm.get(array[i]);
				hm.put(array[i], value+1);
			}
			else {
				hm.put(array[i],value+1);
			}
		}
			return hm;
		
	}

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println(" Enter size : ");
		int size = Input.nextInt();
		int[] iArr = new int[size];
		System.out.println(" Enter numbers into an array : ");
		for( int i =0; i< iArr.length;i++) {
			iArr[i] = Input.nextInt();
		}
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm = Unique_Array(iArr);
		int value =0;
		for( int i : hm.keySet()) {
			value = hm.get(i);
			System.out.println(i + " occures" + value + " times");
		}
		System.out.println(" Unique Array : ");
		for( int i :hm.keySet()) {
			System.out.println(i);
		}
		Input.close();
	}

}
