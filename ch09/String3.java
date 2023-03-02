package ch09;

public class String3 {
	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		
		System.out.println(str.substring(5, 10));
		System.out.println(str.substring(7));
		System.out.println(str.startsWith("친")); 
		
		System.out.println(str.endsWith("친")); 
		
		System.out.println(str.indexOf("친")); 
		System.out.println(str.lastIndexOf("우"));
		System.out.println(str.contains("대")); 
		
		String[] s = str.split(" ");
		for(String a : s) {
			System.out.println(a);
		}
		System.out.println(str.length());
		 
	}

}
