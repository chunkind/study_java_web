package step12;

public class ThreadEx19 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx19_1 th1 = new ThreadEx19_1();
		ThreadEx19_2 th2 = new ThreadEx19_2();

		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			Thread.sleep(1000);
//			th1.sleep(1000);
//			th2.sleep(1000);
			th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
//			th2.join(); // main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print("소요시간:" + (System.currentTimeMillis() - ThreadEx19.startTime));
	} // main
}

class ThreadEx19_1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		for (int i = 0; i < 300; i++) {
//			System.out.print(new String("-"));
//		}
	} // run()
}

class ThreadEx19_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}