package idfc.loans.carloans;

public abstract class Firstabstract {
	int x= 100;
	public void m1() {
		System.out.println("iam m1 concrete  from firstabstract class");
	}
public abstract void m2();
public static void main(String[] args) {
	 Firstabstract f = new Childclass();
	 f.m1();
	 f.m2();
}
}