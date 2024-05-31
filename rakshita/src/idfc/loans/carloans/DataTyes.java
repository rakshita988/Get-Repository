package idfc.loans.carloans;

public class DataTyes {
	byte b ;
	short s ;
	int i ;
	float f ;
	long l  ;
	double d ;
	boolean a ;
	char c ;
	String str;
	static String cname ;
	static float sal ;
	public static void main(String[] args) {
		int x = 20;
		// TODO Auto-generated method stub
		  DataTyes obj = new DataTyes();
		  System.out.println("Byte:"+obj.b);
		  System.out.println("short:"+obj.s);
		  System.out.println("int:"+obj.i);
		  System.out.println("long:"+obj.l);
		  System.out.println("float:"+obj.f);
		  System.out.println("double:"+obj.d);
		  System.out.println("boolean:"+obj.a);
		  System.out.println("char:"+obj.c);
		  System.out.println("String:"+obj.str);
		  System.out.println(cname);
		  System.out.println(sal);
		  System.out.println(x);


	}

}
