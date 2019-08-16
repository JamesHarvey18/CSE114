
public class ArraysTest {
	
	public static void printArray(double[] array) {
		for (int i = 0; i < array.length; i ++)
			System.out.print(array[i] + " ");
	}
	
	// Overloaded method for different array type
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i ++)
			System.out.print(array[i] + " ");
	}
	
	
	public static int[] reverseArray(int[] array) {
		int[] result = new int[array.length];
		
		for (int i = 0, j = result.length - 1;
				i < array.length; i++, j--) {
			result[j] = array[i];
		}
		
		return result;
	}
	
	public static void testingParameters(int number, int[] numbers) {
		number = 1001; // Assign a new value to the number
		numbers[0] = 5555; // Assign a new value to the numbers[0]
	}

	public static void main(String[] args) {
		/*
		double[] myList = new double[10];
		myList[1] = 2;
		
		for (double v:myList)
			System.out.print(v + " "); 
		
		double total = 0;
		for (double v: myList)
			total += v;
		
		for (double v: myList)
			System.out.print(v + " ");
		
		System.out.println("\ntotal = " + total);
		*/
		
		double[] list1 = {1, 2, 3};
		double[] list2 = {4, 5, 6};
		int[] list = {1, 2, 3, 4, 5, 6};
		
		list2 = list1;
		
		list1[0] = 98;
		list2[0] = 99;
		
		
		int a = 5;
		int b = 0;
		int r = a;
		
		r = b++;
		
		printArray(list1);
		System.out.println();
		printArray(list2);
		int[] reversedArray = reverseArray(list);
		printArray(reversedArray);
		
		int x = 1;
		int[] y = new int[10];
		testingParameters(x, y);
		
		System.out.println("X is " + x);
		System.out.println("Y is " + y[0]);
		
	}

}
