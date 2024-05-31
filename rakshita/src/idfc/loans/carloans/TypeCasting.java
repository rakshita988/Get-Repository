package idfc.loans.carloans;

public class TypeCasting {

	public static void main(String[] args) {
		int i = 1000;
		System.out.println(i);
		double i2 = (double)i;
		System.out.println(i2);

		 int i3=(int)i2;
		 System.out.println(i3);
		 
		 char i4 = 'A';
		   int i5=(int) i4;
		   System.out.println(i5);
		   
		  int x1 = 100;
		  System.out.println(x1);
		  
		  Integer x2 = Integer.valueOf(x1);
		  System.out.println(x2);
		  
		    int x3 =(int)x2;
		    System.out.println(x3);
		    
		    String s1 = "100";
		    String s2 = "200";
		    System.out.println(s1+s2);
		    
		    int  b1= Integer.parseInt(s1);
		    int b2 = Integer.parseInt(s2);
		    System.out.println(b1+b2);
		    
		    
		    float f1 = Float.parseFloat(s1);
		    float f2 = Float.parseFloat(s2);
		    System.out.println(f1+f2);
	}

}
