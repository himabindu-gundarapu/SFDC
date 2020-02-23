
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = new String("am good learner");
	int length = str.length();
	System.out.println("length of the string is :" +length);
	
	for(int i=0; i<length;i++) 
	{
		
		//System.out.println(i);
		//System.out.println(str.charAt(i));
		

		if((str.charAt(i))== ' ' || i==length-1)
			
		{
			for(int j=i-1;j>=0;j--)
			{
				 str.charAt(j);
				 
				
			
			System.out.print(str.charAt(j));
			
			}

			System.out.println(" ");
			
		
		
		
		}
	
	}
	}

}