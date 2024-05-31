package idfc.loans.carloans;

public class Variable {
	int a =100;
	static String cname= "rakshita";
	
		public void m1()
		{
			int a = 200;// primitive local variable
			System.out.println(a);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Variable obj = new Variable();
       System.out.println(obj.a);
       System.out.println(cname);
       obj.m1();
	}

}
