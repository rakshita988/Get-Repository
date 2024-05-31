package idfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
    Hdfc h =new Hdfc();
    h.deposit();
    h.withdrawl();


	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden  withdraw from Hdfc");


	}

	@Override
	public void deposit() {

		System.out.println("iam overriden  deposit from Hdfc");
		
	}

}
