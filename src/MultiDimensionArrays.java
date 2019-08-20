import java.util.*;

public class MultiDimensionArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrix = new int[10][10];
		
		for(int[] row:matrix) {
			for(int i=0; i<row.length; i++) 
				row[i] = input.nextInt();
		}
	}
	
	public static boolean isRagged(int [][] a) { //Ragged array is a multi-dimension array that isn't even
		int l0 = a[0].length;
		for(int[] row: a)
			if(row.length != l0)
				return true;
		return false;
	}
	
	public static int sum(int[][] matrix) {
		int total = 0;
		for(int[] row: matrix) {
			for(int elem: row)
				total += elem;
		}
		return total;
	}
	
	public static void sumColumns(int[][] matrix) {
		for(int c=0; c<matrix[0].length; c++) {
			int total = 0;
			
			for(int r=0; r<matrix.length; r++) 
				total += matrix[r][c];
			
			System.out.println("The total for column " + c + " is " + total);
		}
	}

}
