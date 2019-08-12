
public class Arrays {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i=0; i < a.length; i ++) {
			a[i] = i;
		}
		//shuffle(a);
		shiftLeft(a);
		shiftLeft(a);
		shiftLeft(a);
		shiftLeft(a);
		// linearSearch(a, key), binarySearch(a, key), selectionSort(a), insertionSort(a), bubbleSort(a), etc...
		print(a);

	}
	public static void print(int[] x) {
		for (int i=0; i<x.length; i++)
			System.out.println(x[i]);
	}
	
	public static void shuffle(int[] a) {
		for(int i = 0; i<a.length; i++) {
			int j = (int)(Math.random() * a.length);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	public static void shiftLeft(int[] a) {
		int temp = a[0];
		for(int i = 1; i < a.length; i++) {
			a[i-1] = a[i];
		}
		a[a.length - 1] = temp;
	}

}
