package praktikum2;

import lib.TextIO;

public class T2heAsendus {
	public static void main(String[] args) {

		String tekst;
		System.out.print("Sisesta tekst:");
		tekst = TextIO.getln();
		tekst = tekst.replaceAll("(aA*|Aa*)+", "_");
		System.out.println("peale asendust on tekst:" + tekst);
	}
}
