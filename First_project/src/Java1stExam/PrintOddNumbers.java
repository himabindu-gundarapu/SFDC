package Java1stExam;

public class PrintOddNumbers {
	public static void print_oddNumbers(int n) {
		int i=1;
		while(i<n)
		{
			if(i%2 !=0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
	
		print_oddNumbers(100);
		
		
	}

}
