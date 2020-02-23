
public class StringReverse {

	public static void Reverse(int sp,int ep,String str1)
	{
		for(int i = ep; i>=sp; i--)
		{
			System.out.print(str1.charAt(i));
		}
		
		System.out.print(' ');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startPosition = 0;
		int endPosition = 0;
		String str = new String("Java Basics For Beginners");
		int len = str.length();
		while( endPosition<len)
		{
			while ((endPosition < len) && (str.charAt(endPosition) != ' '))
			{
				endPosition++;
			}
			
			
			Reverse(startPosition, endPosition-1, str);
			endPosition++;
			startPosition = endPosition;
		}		
	}	
 
}


