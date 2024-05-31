package idfc.loans.homeloans;

import idfc.loans.carloans.A;

 class C extends A {
	public void m3() {
		System.out.println("im m3 from C");
	}
	public void m1() {
		System.out.println("im m1 from A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		
		C c = new C();
		System.out.println(c.x);
		c.m3();
		c.m1();
		
	}

}
