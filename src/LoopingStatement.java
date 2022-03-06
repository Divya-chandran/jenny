
public class LoopingStatement {
	
	public static void main(String[] args) {
		
		int a[][][] = new int[2][2][2];
		
			a[0][0][0] = 10;
			a[0][0][1] = 20;
			a[0][1][0] = 30;
			a[0][1][1] = 40;
			a[1][0][0] = 50;
			a[1][1][1] = 60;
			a[1][0][1] = 70;
			a[0][1][1] = 80;
			
		
		
		for (int i = 0; i<2; i++) {
			
			for (int j = 0; j<2; j++) {
				
				for (int k = 0; k< 2; k++) {
					
					System.out.println(a[i][j][k]);
					
				}
				
				
				
			}
			
		}
		System.out.println();
	}
	
}