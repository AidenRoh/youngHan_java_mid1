package lang.object.poly;

public class ObjectPolyExample2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		Object object = new Object(); //Object도 인스턴스를 만들 수 있다.

		Object[] objects = {dog, car, object};
		size(objects);
	}

	private static void size(Object[] objects) {
		System.out.println("전달도니 객체의 수는: " + objects.length);
	}
}
