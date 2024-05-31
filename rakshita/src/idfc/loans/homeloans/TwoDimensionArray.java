package idfc.loans.homeloans;

public class TwoDimensionArray {

	public static void main(String[] args) {
       int[][] a = {
    		   {10,20,77},
    		   {40,50},
    		   {70,80,90,55}
       };
for(int i=0; i<3; i++) {
	for(int j=0; j<a[i].length; j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
System.out.println("-------------------------------");

    for(int[]i:a) {
	   for(int j: i) {
		   System.out.print(j+" ");
		
	}
	   	System.out.println();
}

	}

}
