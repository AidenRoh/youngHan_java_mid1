package time;

import java.time.LocalDateTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		LocalDateTime nowDT = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
		System.out.println("현재 날짜시간 = " + nowDT);
		System.out.println("지정 날짜시간 = " + ofDt);
	}
}
