package exception.basic.checked;

import java.rmi.ServerError;

public class CheckedCatchMain {

	public static void main(String[] args) {
		Service service = new Service();
		service.callCatch();
		System.out.println("정상 종료");
	}
}
