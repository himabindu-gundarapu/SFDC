
public class Merge2arrays {
	public static void main(String[] args) {
		int[] a1 = {2,5,6,11,10};
		int[] a2 = {3,8,9,10,12,14};
		int  size = a1.length+a2.length;
		int[] a3 = new int[size];
		for( int i =0; i< a1.length;i++)
		{
			for(int j =0; j< a2.length;j++)
			{
				if( a1[i]<=a2[j]) {
					//System.out.println(a2[j]);
					a3[i] =a1[i];
					
				}
				else {
					a3[i]=a2[j];
				}

				}
			}
		
		for( int i =0 ; i< a3.length;i++) {
			System.out.println(a3[i]);
		}
	}


}
