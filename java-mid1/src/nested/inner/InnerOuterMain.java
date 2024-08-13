package nested.inner;

import nested.inner.InnerOuter.Inner;

public class InnerOuterMain {

	public static void main(String[] args) {
		InnerOuter outer = new InnerOuter();
		Inner inner = outer.new Inner();
		inner.print();

		Inner inner1 = new InnerOuter().new Inner();
		inner1.print();

		System.out.println("inner = " + inner.getClass());
	}
}
