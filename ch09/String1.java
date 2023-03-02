package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java"; //기본형
		String str2 = "java";
		String str3 = new String("java"); //참조형
		
		if (str1.equals(str2)) System.out.println("Str1과 Str2는 같다");
		else System.out.println("Str1과 Str2는 다르다");
		
		if (str1.equals(str3)) System.out.println("Str1과 Str3는 같다");
		else System.out.println("Str1과 Str3는 다르다");
		
		if (str2.equals(str3)) System.out.println("Str2과 Str3는 같다");
		else System.out.println("Str2과 Str3는 다르다");
		
		System.out.println("=======================");
		
		if (str1 == str2) System.out.println("Str1과 Str2는 같다");
		else System.out.println("Str1과 Str2는 다르다");
		
		if (str1 == str3) System.out.println("Str1과 Str3는 같다");
		else System.out.println("Str1과 Str3는 다르다");
		
		if (str2 == str3) System.out.println("Str2과 Str3는 같다");
		else System.out.println("Str2과 Str3는 다르다");
		
		
	}
}
