package idfc.loans.homeloans;

public class Gpay {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		 System.out.println("through Gpay :"+s.getMainbalance());
		 
		 s.setMainbalance(1000);
		 System.out.println("through Gpay update balance:" +s.getMainbalance() );
	}

}
