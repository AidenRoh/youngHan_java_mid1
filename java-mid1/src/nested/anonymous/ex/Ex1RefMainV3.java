package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

	public static void hello(Process func) {
		System.out.println("프로그램 시작");

		//code piece engaged
		func.run();
		//code piece terminated

		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {

		Process dice = new Process() {
			@Override
			public void run() {
				int randomValue = new Random().nextInt(6) + 1;
				System.out.println("dice = " + randomValue);
			}
		};

		Process sum = new Process() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("i = " + i);
				}
			}
		};

		hello(dice);
		hello(sum);
	}
}