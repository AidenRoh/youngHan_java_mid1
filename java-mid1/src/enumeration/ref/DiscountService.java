package enumeration.ref;

public class DiscountService {

	public int discount(ClassGrade classGrade, int price) {
		//10000 * (20 / 100)
		return price * classGrade.getDiscountPercent() / 100;
	}
}
