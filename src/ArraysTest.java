
public class ArraysTest {

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
		
		list2 = list1;
		
		list1[0] = 98;
		list2[0] = 99;
		System.out.println(list1[0]);
		
		int a = 5;
		int b = 0;
		int r = a;
		
		r = b++;
		
	}

}
