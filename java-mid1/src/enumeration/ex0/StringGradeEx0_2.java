package enumeration.ex0;

public class StringGradeEx0_2 {
	public static void main(String[] args) {
		int price = 10000;

		DiscountService discountService = new DiscountService();

		//존재하지 않는 등급
		int vip = discountService.discount("VIP", price);
		System.out.println("VIP 등급의 할인 금액: " + vip);

		//오타
		int wrongTyping = discountService.discount("DIAMONDD", price);
		System.out.println("WRONG TYPING의 할인 금액: " + wrongTyping);

		//소문자 입력
		int lowerCase = discountService.discount("gold", price);
		System.out.println("LOWER CASE의 할인 금액: " + lowerCase);

	}
}
