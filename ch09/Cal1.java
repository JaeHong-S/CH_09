package ch09;

import java.util.*;


public class Cal1 {
	public static void main(String[] args) {
//		추상클래스이면서 생성자가 protected
//		월은 0 ~ 11 으로 설정됨
		Calendar cal = Calendar.getInstance();//new Calendar();
		System.out.printf("오늘은 %d년 %d월 %d일입니다\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //달 기준
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));  // 년도 기준
		
		Date date = new Date();
		System.out.println(date);
	}

}
