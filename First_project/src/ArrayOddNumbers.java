
public class ArrayOddNumbers {

	public static void main(String[] args) {
		int[] iArrInput = {1,4,23,56,3,80};
		System.out.println("Odd numbers of given Array");
		for(int index = 0; index<=iArrInput.length-1;index++) {
			if(iArrInput[index]%2 != 0) {
				System.out.println(+iArrInput[index]);
				
			}
			
		}

	}

}
