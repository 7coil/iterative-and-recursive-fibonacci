
public class fibonacci {
	public static void main(String args[]) {
		// Print the first 10 Fibonacci numbers
		System.out.println(iterate(30));
		System.out.println(formulate(30));
		System.out.println(recurse(30));
	}
	
	public static int iterate(int end) {
		int temp, i, a = 1, b = 1;
		
		for(i = 0; i < end - 1; i++) {
			// Shuffle variables around for the next iteration
			temp = a + b;
			a = b;
			b = temp;
		}
		
		return a;
	}
	
	public static int formulate(int i) {
		double golden = (1 + Math.sqrt(5)) / 2;
		double rootFive = Math.sqrt(5);
		
		return (int) Math.round(Math.pow(golden, i)/rootFive);
	}
	
	public static int recurse(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return recurse(i - 1) + recurse(i - 2);
	}
}
