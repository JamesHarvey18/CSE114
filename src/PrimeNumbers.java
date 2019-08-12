
public class PrimeNumbers {

	public static void main(String[] args) {
		first1000PrimeNumbers();

	}
	
	public static void first1000PrimeNumbers() {
		int count = 0;
		int i = 1;
		while(count < 1000) {
			i++;
			if(isPrime(i)) {
				count++;
				System.out.print(i + " " + (count%10==0 ? "\n": ""));
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i<n; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}

}
