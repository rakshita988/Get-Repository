package idfc.loans.carloans;

import java.io.FileInputStream;

public class FirstClass {
	int a= 10, b=20, c;
	public void add()
	{
		c=a+b;
		System.out.println("add of A&B is:" +c);
	}
     public void sub()
{      
    	 c= a-b;
    	 System.out.println("sub of A & B is:"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello java");
             FileInputStream fis;
          FirstClass obj=new FirstClass();
          obj.add();
          obj.sub();
             //ctrl+shift+o-to wanting imports and to remove unwanting imports
	}
	

}
