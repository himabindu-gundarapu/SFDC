
public class ArrayExample1 {

	public static void main(String[] args) {
		
		int sp = 0;
		int[] a = {1,5,10,4,9,8,12};
		
		for(int i = 0; i< a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				sp =i;
				System.out.println(a[i]);
			}
			
			

		}

	}
}
