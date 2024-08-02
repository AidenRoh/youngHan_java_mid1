package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {

	public int discount(ClassGrade classGrade, int price) {
		int discountPercent = 0;

		if (classGrade == ClassGrade.BASIC) {
			discountPercent = 0;
		} else if (classGrade == ClassGrade.GOLD) {
			discountPercent = 10;
		} else if (classGrade == ClassGrade.DIAMOND) {
			discountPercent = 20;
		} else {
			System.out.println("할인X");
		}

		//10000 * (20 / 100)
		return price * discountPercent / 100;
	}
}
