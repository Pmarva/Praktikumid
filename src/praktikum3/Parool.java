package praktikum3;

import lib.TextIO;

public class Parool {
	public static void main(String[] args) {
		
		String parool = new String("Marva!23");
		
		System.out.print("Sisesta parool:");
		String sisend = TextIO.getlnString();
		if(parool.equals(sisend)) {
			System.out.println("Parool sobis");
		} else {
			System.out.println("Parool ei sobi");
		}
	}
}
