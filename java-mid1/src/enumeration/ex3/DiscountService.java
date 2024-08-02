package enumeration.ex3;

import static enumeration.ex3.Grade.*;

import enumeration.ex2.ClassGrade;

public class DiscountService {

	public int discount(Grade grade, int price) {
		int discountPercent = 0;

		if (grade == BASIC) {
			discountPercent = 0;
		} else if (grade == GOLD) {
			discountPercent = 10;
		} else if (grade == DIAMOND) {
			discountPercent = 20;
		} else {
			System.out.println("할인X");
		}

		//10000 * (20 / 100)
		return price * discountPercent / 100;
	}
}
