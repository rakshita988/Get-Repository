package idfc.loans.homeloans;

public class TwoDimensionArray2 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		a[0][0]= 10;
		a[0][1]= 20;
		a[0][2]= 30;
		a[0][3]= 40;
		
		
		a[1][0]= 50;
		a[1][1]= 60;
		a[1][2]= 70;
		a[1][3]= 80;

		
		a[2][0]= 90;
		a[2][1]= 100;
		a[2][2]= 101;
		a[2][3]= 102;
		
		
		for(int[] i:a) {
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
