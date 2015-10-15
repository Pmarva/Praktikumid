package praktikum2;

import lib.TextIO;

public class KaheArvuKorrutis {
	public static void main(String[] args) {

		int a;
		int b;
		int vastus;

		System.out.println("Sisesta esimene number");
		a = TextIO.getInt();
		System.out.println("Sisesta teine number");
		b = TextIO.getInt();
		vastus = a * b;
		System.out.println(vastus);
	}
}
