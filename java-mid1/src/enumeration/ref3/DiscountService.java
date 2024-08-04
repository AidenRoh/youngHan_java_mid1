package enumeration.ref3;

public class DiscountService {
// ENUM에 discount 로직을 넣음으로 사실상 필요없는 로직
	public int discount(Grade grade, int price) {
		return grade.discount(price);
	}
}
