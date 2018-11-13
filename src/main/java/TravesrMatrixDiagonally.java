
public class TravesrMatrixDiagonally {


	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		
		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(String.valueOf(arr[i][j]));
			}
		}
	}
}
