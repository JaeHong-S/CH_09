package ch09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 1111);
		Person p2 = new Person("홍길동", 1111);
		if (p1.equals(p2)) System.out.println("같다");
		else System.out.println("다르다");
//		객체를 출력 : 주소 -->패키지명.클래시명@해시코드
		System.out.println(p1);
		System.out.println(p2);
	}

}
