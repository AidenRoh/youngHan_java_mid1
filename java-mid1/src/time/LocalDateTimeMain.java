package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		LocalDateTime nowDT = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
		System.out.println("현재 날짜시간 = " + nowDT);
		System.out.println("지정 날짜시간 = " + ofDt);

		//날짜와 시간 분리
		LocalDate localDate = ofDt.toLocalDate();
		LocalTime localTime = ofDt.toLocalTime();
		System.out.println("localDate = " + localDate);
		System.out.println("localTime = " + localTime);

		//날짜와 시간 합체
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime = " + localDateTime);

		//계산(불변)
		LocalDateTime ofDtPlus = ofDt.plusDays(1000);
		System.out.println("지정 날짜시간 +1000d = " + ofDtPlus);
		LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
		System.out.println("지정 날짜시간 +1y = " + ofDtPlus1Year);

		//비교
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDT.isBefore(ofDt));
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDT.isAfter(ofDt));
		System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " + nowDT.isEqual(ofDt));
	}
}
