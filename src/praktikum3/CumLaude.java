package praktikum3;

import lib.TextIO;

public class CumLaude {
	
	public static double keskHinne;
	public static double lopuTooHinne;
	
	public static void main(String[] param) {
		
		System.out.print("Sisesta keskmine hinne");
		keskHinne = TextIO.getDouble();
		
		if(keskHinne<1 || keskHinne>5) {
			System.out.println("Hindes viga!!!!");
			System.out.println("Sisesta uus hinne!!");
		}
		
		System.out.print("Sisesta lõputöö hinne");
		lopuTooHinne = TextIO.getDouble();
		
		if(lopuTooHinne<1 || lopuTooHinne>5) {
			System.out.println("Hindes viga!!!!");
			System.out.println("Sisesta uus hinne!!");
		}
		
		if (keskHinne > 4.5 && lopuTooHinne == 5) {
			System.out.println("Saad cum laude");
		} else {
			System.out.println("Ei saa");
		}
		
	}
}
