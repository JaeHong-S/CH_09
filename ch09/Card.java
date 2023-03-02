package ch09;

public class Card {
	String kind;
	int number;
	
	public Card(String kind, int number ) {
		this.kind = kind; this.number = number;
	}
	public boolean equals(Card obj) {
		
		return kind == obj.kind;
	}
	
	public String toString() {
		
		return "출력 카드 [ 종류 :" +kind + ", 번호 :" +number +"]";
	}

}
