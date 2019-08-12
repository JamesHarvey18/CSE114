
public class KgToPoundsTable {

	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds\t\t Pounds\t\tKilos");
		for(int i=1, j=20; i<200; i+=2, j+=5) {
			System.out.printf("%d\t\t%.1f\t\t%d\t\t%.2f\n", i, i*2.2, j, j/2.2);
		}

	}

}
