package factorial;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 29.
 * 
 */
public class Factorial {
	
	public int f(int n) {
		if(n == 1) {
			System.out.println(n);
		}else {
			System.out.print(n + "*");
		}
		return n==1 ? n : n*f(n-1);
	}
	
	public static void main(String[] args) {
		Factorial fack = new Factorial();
		int result = fack.f(4);
		System.out.println("result : " + result);
	}
}