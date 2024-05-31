package idfc.loans.carloans;

public class Icic implements Rbi{

	public static void main(String[] args) {

Icic obj = new Icic();
obj.withdrawl();
obj.deposit();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden  withdraw from Icic");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden  deposite from Icic");
		// TODO Auto-generated method stub
		
	}

}
