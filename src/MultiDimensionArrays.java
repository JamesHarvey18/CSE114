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
	
	public static boolean isRagged(int [][] a) {
		int l0 = a[0].length;
		for(int[] row: a)
			if(row.length != l0)
				return true;
		return false;
	}

}
