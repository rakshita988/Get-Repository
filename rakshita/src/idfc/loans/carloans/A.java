package idfc.loans.carloans;

  public  class A {
	public int x = 100;
	public  void m1() {
		System.out.println("im m1 from A");
	}
	public static void m4() {
		System.out.println("im m4 static method from A");
	}
   
	static {
		System.out.println("1st static block");
		
	}
	  
	static {
		System.out.println("2nd static block ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   A a = new A();
   System.out.println(a.x);
   a.m1();
   a.m4();
	}

}
