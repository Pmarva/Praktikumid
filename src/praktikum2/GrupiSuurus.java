package praktikum2;

import lib.TextIO;

public class GrupiSuurus {
	public static void main(String[] args) {
		int inimesteArv;
		int grupiSuurus;

		System.out.println("Sisesta inimeste arv: ");
		inimesteArv = TextIO.getInt();
		System.out.println("Sisesta grupi suurus: ");
		grupiSuurus = TextIO.getInt();
		System.out.println("Saab moodustada:" + inimesteArv / grupiSuurus + " gruppi");
		System.out.println("Üle jääb:" + inimesteArv % grupiSuurus + " inimest");
	}
}
