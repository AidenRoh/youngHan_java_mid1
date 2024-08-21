package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data); //추가

		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 e) {
			System.out.println("[Connection Error] address: " + e.getAddress() + ", message: " + e.getMessage());
		} catch (NetworkClientExceptionV3 e) {
			System.out.println("[Network Error] message: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("[Undefined Error] message: " + e.getMessage());
		} finally {
			client.disconnect();
		}
	}
}
