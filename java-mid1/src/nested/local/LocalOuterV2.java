package nested.local;

public class LocalOuterV2 {

	private int outInstanceVar = 3;

	public void process(int paramVar) {

		int localVar = 1;

		//지역 변수에 접근 제어자를 쓸 수 없듯이 지역 클래스에도 접근 제어자를 사용할 수 없다. (맴버 변수만 가능)
		class LocalPrinter implements Printer {
			int value = 0;

			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		}

		LocalPrinter printer = new LocalPrinter();
		printer.print();
	}

	public static void main(String[] args) {
		LocalOuterV2 localOuter = new LocalOuterV2();
		localOuter.process(2);
	}
}
