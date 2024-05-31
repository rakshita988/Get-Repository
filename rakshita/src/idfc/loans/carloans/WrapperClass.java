package idfc.loans.carloans;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        Integer obj = new Integer(a);//boxing
       
        Integer a1 = Integer.valueOf(a);
       System.out.println(a1);
        
         	Integer a2 = a1;//auto-boxing
         	System.out.println(a2);
         	
        int i = a2;
        System.out.println(i);
        
        ArrayList <Double> l = new ArrayList<Double>(); 
         l.add(36.00);
	}

}
