package idfc.loans.homeloans;

public class Sbi {
private	 int mainbalance  = 2000;
private String getmainbalance;

	public int getMainbalance() {
		System.out.println("through Sbi bank:"+mainbalance);
		return mainbalance;
		
	}


	public void setMainbalance(int mainbalance) {
		this.mainbalance = mainbalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sbi s = new Sbi();
	System.out.println("through Sbi bank:"+s.getmainbalance);
	
	}

		
	}


