package nested.inner;

import org.w3c.dom.ls.LSOutput;

public class InnerOuter {

	private static int outClassValue = 3;
	private int outInstanceValue = 2;

	class Inner {

		private int innerInstanceValue = 1;

		public void print() {
			//자기 자신에 접근
			System.out.println(innerInstanceValue);

			//외부 클래스의 인스턴스 맴버에 접근 가능, private도 접근 가능
			System.out.println(outInstanceValue);

			//외부 클래스의 클래스 맴버에 접근 가능, private도 접근 가능
			System.out.println(InnerOuter.outClassValue);
		}
	}

}