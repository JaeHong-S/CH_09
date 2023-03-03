package ch09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		int[] number = new int[100];
		int[] count = new int[10];
		Random ran = new  Random();
		for(int i = 0; i < number.length; i++) {
			number[i] = ran.nextInt(10);
			System.out.print(number[i] + " ");
			if(i % 10 == 9) System.out.println(); //10개 출력 후에 줄바꿈 후 출력
		}
		for (int i = 0; i < number.length; i++) {
			count[number[i]]++; //number[i] 가 들어있는 count 인덱스에 1증가
			
		}
		
		for(int i = 0; i < count.length; i++) {
			String str = printGraph('#', count[i]);
			System.out.println(i + "의 갯수 : " + str + " " + count[i]);
		}
	}

	private static String printGraph(char c, int value) {
		// TODO Auto-generated method stub
		char[] bar = new char[value];
		for(int i = 0; i < bar.length; i++) { // 숫자만큼 #으로 채우기
			bar[i] = c;
		}
		return new String(bar);
	}

}
