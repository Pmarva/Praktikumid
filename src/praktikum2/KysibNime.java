package praktikum2;

import highlow.TextIO;

public class KysibNime {
	public static void main(String[] args) {
		String nimi;
		System.out.print("Sisesta nimi:");
		nimi = TextIO.getWord();
		int nimePikkus = nimi.length();
		System.out.println("Nime pikkus on:" + nimePikkus + " tähte");
	}
}
