package lang.string.equals;

public class StringEqualsMain1 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("new String () == 비교: " + (str1 == str2));
		System.out.println("new String () equals 비교: " + (str1.equals(str2)));

		String str3 = "hello";
		String str4 = "hello";
		System.out.println("literal == 비교: " + (str3 == str4));
		//true가 나오는 이유: String pool(힙 영역)이 존재하여 literal로 String을 생성시 같은 문자열 값이 있으면 해당 객체의 주소를 불러옴
		System.out.println("literal equals 비교: " + (str3.equals(str4)));
	}
}
