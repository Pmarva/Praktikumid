package praktikum4;

public class tabel3 {
	public static void main(String[] args) {
		
		int suurus = 9;
		
		for(int j=0; j<suurus; j++) {
			for(int i=suurus-1; i>-1; i--) {
				System.out.print(Math.abs(i-j)+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
