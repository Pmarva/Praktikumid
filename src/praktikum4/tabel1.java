package praktikum4;

public class tabel1 {
	public static void main(String[] args) {
		int suurus=10;
		
		for(int i=0;i<suurus;i++) {
			for(int j=0; j<suurus;j++) {
				
				if(i==j) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println("");
			
		}
	}
}
