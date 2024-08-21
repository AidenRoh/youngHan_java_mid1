package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data); //추가

		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 e) {
			System.out.println("[Connection Error] address: " + e.getAddress() + ", message: " + e.getMessage());
		} catch (SendExceptionV3 e) {
			System.out.println("[Send Error] data: " + e.getSendData() + ", message: " + e.getMessage());
		} finally {
			client.disconnect();
		}
	}
}