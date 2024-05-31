package idfc.loans.carloans;

public class Childclass extends Firstabstract{

	public static void main(String[] args) {
Childclass c=new Childclass();
c.m2();
c.m1();


	}

	@Override
	public void m2() {

System.out.println("iam m2 concrete from childclass");
	}

}
