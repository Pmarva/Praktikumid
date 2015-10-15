package praktikum3;

import lib.TextIO;

public class TehisIntellekt {
	public static void main(String[] args) {
		System.out.print("Sisesta vanus 1:");
		int esimeneVanus = TextIO.getInt();
		System.out.print("Sisesta vanus 2:");
		int teineVanus = TextIO.getInt();

		int vahe = Math.abs(esimeneVanus - teineVanus);
		System.out.println(vahe);

		if (vahe >= 10) {
			System.out.println("vahe üle kümme aasta");
		} else if (vahe > 5) {
			System.out.println("vahe üle viie aasta");
		}

		if (vahe < 6) {
			System.out.println("Sobib");
		}

	}
}
