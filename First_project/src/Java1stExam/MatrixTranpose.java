package Java1stExam;

import java.util.Scanner;

public class MatrixTranpose {

	public static int[][] Matrix_transpose(int[][] iArr) {
		int row;
		int col;
		
		row = iArr.length;
		col = iArr[0].length;
		int[][] tempArr = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				tempArr[j][i] = iArr[i][j];
				//System.out.println(tempArr[j][i]);
			}
		}
		return tempArr;
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter no of rows and coloumns : ");
		int rowSize = Input.nextInt();
		int colSize = Input.nextInt();
		int[][] iArr = new int[rowSize][colSize];
		System.out.println("enter elements : ");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				iArr[i][j] = Input.nextInt();
				//System.out.println(iArr[i][j]);
			}
		}
	
		int[][] resultArr = Matrix_transpose(iArr);
		int result_row = resultArr.length;
		int result_col = resultArr[0].length;
		for (int i = 0; i <result_row ; i++) {
			for (int j = 0; j < result_col; j++) {
	
				System.out.print(resultArr[i][j] + " ");
			
			}
			System.out.print("\n");
		}
		Input.close();
	}

}


