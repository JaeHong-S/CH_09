package ch09;
enum SchoolType { //enum 열거타입, 데이터형을 만때 사용
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

class Student1 {
	SchoolType school;
	public Student1(SchoolType school) {
		this.school = school;
	}
}
public class EnumTest1 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		if(st1.school == SchoolType.ELEMENTARY)System.out.println("초등학생");
		SchoolType[] schools = SchoolType.values();
		for(SchoolType school:schools) {
			System.out.println(school + " : " + school.ordinal());
		}
	}
}
