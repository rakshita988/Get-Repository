package idfc.loans.homeloans;

public class Calculation {
	public Calculation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	}
	int a,b,c;
	
	
  public void add() {
	  c = a+b;
	  System.out.println("addition of a&b is:"+c);
  }
  	public void sub() {
  		c = a-b;
  		System.out.println("substraction of a&b is:"+c);
  		
  	}
	public static void main(String[] args) {
	Calculation i = new Calculation(123,321);
	i.add();
	i.sub();
	

	}

}
