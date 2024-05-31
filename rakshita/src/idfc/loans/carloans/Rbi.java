package idfc.loans.carloans;

public interface Rbi {
	int x=100;
	
	public void withdrawl();
	public void deposit();			
   public static void main(String args[]) {
	   Rbi h,i;
	   i= new Icic();
	   i.withdrawl();
	   i.deposit();
	   h= new Hdfc();
	   h.deposit();
	   h.withdrawl();
   }
}
   
	
