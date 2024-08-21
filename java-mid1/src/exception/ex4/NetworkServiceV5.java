package exception.ex4;

import exception.basic.checked.MyCheckedException;
import exception.basic.unchecked.MyUncheckedException;

public class NetworkServiceV5 {

	public void sendMessage(String data) {
		String address = "http://example.com";

		try (NetworkClientV5 client = new NetworkClientV5(address)) {
			client.initError(data);
			client.connect();
			client.send(data);
		} catch (Exception e) {
			System.out.println("[예외 확인]: " + e.getMessage());
			throw e; // <-- 해당 에러는 client에서 발생하게될 에러이고 Client 클래스의 에러는 전부 RuntimeException으로 만들었기에
			//sendMessage 메서드에서 따로 throws 키워드를 쓸 필요가 없음
		}
	}
}
