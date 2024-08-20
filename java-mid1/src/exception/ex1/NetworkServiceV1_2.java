package exception.ex1;

public class NetworkServiceV1_2 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV1 client = new NetworkClientV1(address);
		client.initError(data); //추가

		String connectResult = client.connect();
		if (isError(connectResult)) {
			System.out.println("[Network Error Occurred] Error Code: " + connectResult);
			return;
		}
		String sendResult = client.send(data);
		if (isError(sendResult)) {
			System.out.println("[Network Error Occurred] Error Code: " + sendResult);
			return;
		}
		client.disconnect();
	}

	private static boolean isError(String resultCode) {
		return !resultCode.equals("success");
	}
}