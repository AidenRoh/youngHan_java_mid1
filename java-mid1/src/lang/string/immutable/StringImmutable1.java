package lang.string.immutable;

public class StringImmutable1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1.concat("java");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		//String은 불변 객체이기 때문에 concat같은 것을 사용하면 새로운 객체를 반환하는 식으로 한다.
	}
}
