package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", gc.get(GregorianCalendar.YEAR), gc.get(GregorianCalendar.MONTH) +1, gc.get(GregorianCalendar.DATE));
		
		
		GregorianCalendar gc2 = new GregorianCalendar(1990, 4, 28);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", gc2.get(GregorianCalendar.YEAR), gc2.get(GregorianCalendar.MONTH) +1, gc2.get(GregorianCalendar.DATE));
		
		GregorianCalendar gc3 = new GregorianCalendar(2003, 6, 14);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", gc3.get(GregorianCalendar.YEAR), gc3.get(GregorianCalendar.MONTH) +1, gc3.get(GregorianCalendar.DATE));
	}

}
