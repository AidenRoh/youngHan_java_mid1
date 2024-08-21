package exception.ex2;

public class NetworkServiceV2_3 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data); //추가

		try {
			client.connect();
			client.send(data);
			client.disconnect();
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[error] code: " + e.getErrorCode() + ", message: " + e.getMessage());
		}
	}



}
