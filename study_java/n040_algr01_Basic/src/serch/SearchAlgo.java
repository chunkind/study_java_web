package serch;

import fibonacci.Fibonacci;

public class SearchAlgo {
	//1 ~ 100까지 오름차순으로 정렬된 숫자 배열 
	public static int[] dataArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
	
	public static void main(String[] args) {
		int target = random();
		int result = 0;
		
		double startTime = System.currentTimeMillis();
//		result = nomalSearch(target); //일반 서치
		result = fibonacciSearch(target); //피보나치 서치 
		double endTime = System.currentTimeMillis();
		
		System.out.println(target + "은 " + result + " 번째 있습니다.");
		System.out.println("소요시간 : " + (endTime - startTime)/1000.0 +"초");
	}

	/**
	 * @Auth : K. J. S.
	 * @Date : 2019. 3. 29.
	 * 일반 서치
	 */
	public static int nomalSearch(int target) {
		int result = 0 ;
		for(int i=0; i<dataArr.length; i++) {
			if(compareValue(i,target)) {
				System.out.println(target + "을 찾았다!");
				result = (i+1);
				break;
			}
		}
		return result;
	}
	
	public static boolean compareValue(int idx, int value) {
		sleep(100); //0.1초 딜레이시킨다.
		return dataArr[idx] == value;
	}
	
	/**
	 * @Auth : K. J. S.
	 * @Date : 2019. 3. 29.
	 * 피보나치 서치
	 */
	public static int fibonacciSearch(int target) {
		int result = 0;
		
		//배열싸이즈를 찾는다.
		int idx = 0;
		for(int i=0; i<dataArr.length; i++) {
			idx = Fibonacci.f(i);
			System.out.println(idx);
			if(idx >  dataArr.length) {
				idx = Fibonacci.f(i-1);
				break;
			}
		}
		
//		for(int i=0; i<dataArr.length; i++) {
//			Fibonacci.f(i);
//		}
		
		return result;
	}
	
	/**
	 * @Auth : K. J. S.
	 * @Date : 2019. 3. 29.
	 * 1~100까지중 숫자 1개 리턴
	 */
	public static int random() {
		return (int) (Math.random()*100)+1;
	}
	
	/**
	 * @Auth : K. J. S.
	 * @Date : 2019. 3. 29.
	 * time (밀리초) 만큼 지연 시킨다.
	 */
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
