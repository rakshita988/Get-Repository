package idfc.loans.carloans;

public class B extends A{
	
	public void m2() {
		System.out.println("im m2 from B");
	}

	public void m1() {
		System.out.println("im m1 from A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		System.out.println(b.x);
		b.m2();
		b.m1();
		}

}
