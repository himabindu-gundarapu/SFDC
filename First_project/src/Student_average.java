
public class Student_average {

	public static void main(String[] args) {
		int array[][] = {{60,55,70},{80,60,41}};
		double sum = 0;
		double avrg;
		for(int i =0; i<2;i++)
		{
			for(int j=0;j<3;j++) {
				sum = sum + array[i][j];
				}
			avrg = sum/3;
			System.out.println(avrg);
			sum = 0;
		}
		

	}

}
