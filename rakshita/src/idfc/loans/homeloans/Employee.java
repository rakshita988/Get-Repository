package idfc.loans.homeloans;

public class Employee {
	int eid ;
	String ename;
	
  public Employee() {
	  System.out.println("iam default constructor");
	  
  }	
  public Employee(int i, String s) {
	// super();
	  eid = i;
	  
	  ename = s;
	  
  }
  

	public static void main(String[] args) {
		 Employee e1 = new Employee();
		 System.out.println(e1.eid);
		 System.out.println(e1.ename);
		 
		 
		  Employee e2 = new Employee(1122, "pari");
		  System.out.println(e2.eid);
		  System.out.println(e2.ename);
		 



	}

}
