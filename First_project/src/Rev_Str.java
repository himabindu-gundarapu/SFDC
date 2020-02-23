
public class Rev_Str {

	public static void main(String[] args) {
		
		String str = " hi, am Himabindu";
		int start_point = 0;
		int end_point = 0;
		while(end_point<=0) {
			
			if(str.charAt(end_point) != ' ') {
				end_point++;
			}
			else {
				start_point = end_point-1;
				for(int i= start_point;i<=end_point;i--)
				{
					System.out.println(str.charAt(start_point));
				}
				
			}
				
			
		}
		
		

	}

}
