package ch09;

public class String2 {
	public static void main(String[] args) {
//		System.out.println(2 + 0 + 2+ 3 + "년도");
//		System.out.println("년도 : " + 2+0+2+3); 
		String s1 = new String("대박");
		String s2 = "쪽박";
		char[] ch = {'내', '일', '휴', '일'};
		String s3 = new String(ch);
		
		System.out.println(s1 + s2 + s3);
//         index     0123 456789 1011 		
		String s4 = "내일은, 삼일절, 대박";
		String[] s5 = s4.split(", ");
		
		for(int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		System.out.println(s4.substring(2, 8));// 인덱스 2번 부터 8번까지 출력
		System.out.println(s4.substring(2));// 인덱스 2번 부터 끝까지
		System.out.println(s4.startsWith("내")); //'내'로 시작하면 true 아니면 false
		System.out.println(s4.startsWith("일"));//'일'로 시작하면 true 아니면 false
		System.out.println(s4.endsWith("박")); //'박'으로 끝나면 true 아니면 false
		System.out.println(s4.endsWith("대"));//'대'으로 끝나면 true 아니면 false
		System.out.println(s4.indexOf("일")); //앞에서부터 찾아서 발견된 인덱스 넘버
		System.out.println(s4.lastIndexOf("일")); //뒤에서 부터 찾아서 발견된 인덱스 넘버
		System.out.println(s4.contains("일")); //포함여부
		System.out.println(s4.contains("스")); //포함여부
		
		
		
	
		
	}
}
