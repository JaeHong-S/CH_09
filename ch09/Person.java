package ch09;

public class Person {
	String name;
	int IdNo;
	
	public Person(String name, int IdNo) {
		this.name = name; this.IdNo = IdNo;
	}
	@Override
	public boolean equals(Object obj) {//equals --> 같다는 기준을 정할 때 사용
//		return IdNo == ((Person)obj).IdNo; //주민번호만 같다면 같은걸로 조건을 준것
		return name.equals(((Person)obj).name);
	}
//	객체를 출력할 혈태를 지정 --> 객체의 문자열 자체를 설정
	public String toString() {
		
		return "인간[이름 : " + name +", 주민번호 :" + IdNo +"]" ;
	}
}
