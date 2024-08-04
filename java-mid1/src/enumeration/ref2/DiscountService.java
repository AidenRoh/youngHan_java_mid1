package enumeration.ref2;

public class DiscountService {

	public int discount(Grade grade, int price) {
		//10000 * (20 / 100)
		return price * grade.getDiscountPercent() / 100;
	}
}
