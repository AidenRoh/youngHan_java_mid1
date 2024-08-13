package nested.nested;

public class NestedOuter {

	private static int outClassValue = 3;
	//static 자체가 전역 변수를 만들기 위함인데 private을 쓴다면 static을 사용하는 목적과 상충되지 않나?
	//
	private int outInstanceValue = 2;

	static class Nested {
		private int nestedInstanceValue = 1;

		public void print() {

			//자신의 맴버에 접근
			System.out.println(nestedInstanceValue);

			//바깥 클래스의 인스턴스 멤버에 접근할 수 없다. - static은 당연히 인스턴스에 접근할 수 없다. 메모리 위치가 다르다.
//			System.out.println(outInstanceValue);

			//바깥 클래스의 클래스 멤버에는 접근할 수 있다.(당연하다, 하지만 --> ) private도 접근 가능하다는 것이 특징이다.
			System.out.println(NestedOuter.outClassValue);
		}
	}

}
