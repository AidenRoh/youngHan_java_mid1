package exception.ex2;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class NetworkServiceV2_2 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data); //추가

		try {
			client.connect();
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[error] code: " + e.getErrorCode() + ", message: " + e.getMessage());
			return;
		}

		try {
			client.send(data);
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[error] code: " + e.getErrorCode() + ", message: " + e.getMessage());
			return;
		}

		client.disconnect();
	}



}
