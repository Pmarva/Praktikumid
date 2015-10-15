package praktikum4;

public class tabel2 {
	public static void main(String[] args) {
		int suurus=15;
		
		System.out.print(" ");
		for(int k=0; k<suurus*2; k++) {
			System.out.print("-");
		}
		System.out.println("");
		
		for(int i=0;i<suurus;i++) {
			System.out.print("|");
			
			for(int j=0; j<suurus;j++) {
				System.out.print(" ");
				if(i==j) {
					System.out.print("x");
				} else if((suurus-1)-i==j) {
					System.out.print("x");
				} else {
					System.out.print(0);
				}
				
			
			}
			System.out.print("|");
			System.out.println("");	
		}
		System.out.print(" ");
		for(int k=0; k<suurus*2; k++) {
			System.out.print("-");
		}
		System.out.println("");
	}
}
