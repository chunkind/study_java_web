package fibonacci;

public class Fibonacci {
	
	public static int f(int n) {
		if (n <= 1)
			return n;
		else
			return f(n-2) + f(n-1);
	}
	
	public static void main(String[] args) {
		int cnt = 6;
		for(int i=1; i<=cnt; i++) {
			System.out.print(f(i) + " ");
		}
	}
}
