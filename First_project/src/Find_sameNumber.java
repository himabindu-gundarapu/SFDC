
public class Find_sameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,45,90,4,2,6,2};
		int count = 0;
		int samenumber = 0;
		for (int i = 0; i<array.length; i++)
		{
			if( array[i] == samenumber)
			{
				samenumber = array[i];
				count = count++;
				
			}
			System.out.println(count);
		}


	}

}
