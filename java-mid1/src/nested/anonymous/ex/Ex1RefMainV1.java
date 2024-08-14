package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {


	public static void helloRunnable(Process func) {
		System.out.println("프로그램 시작");

		//code piece engaged
		func.run();
		//code piece terminated

		System.out.println("프로그램 종료");
	}

	static class Dice implements Process {
		@Override
		public void run() {
			int randomValue = new Random().nextInt(6) + 1;
			System.out.println("dice = " + randomValue);
		}
	}

	static class Sum implements Process {
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("i = " + i);
			}
		}
	}

	public static void main(String[] args) {
		helloRunnable(new Dice());
		helloRunnable(new Sum());
	}
}
