package idfc.loans.homeloans;

public class UserDifineArray {
	int eno;
	String ename;
	
	public UserDifineArray(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "UserDifineArray [eno=" + eno + ", ename=" + ename + "]";
	}

	public static void main(String[] args) {
		 UserDifineArray obj = new UserDifineArray(123,"sai");
         //System.out.println(obj.eno);
        // System.out.println(obj.ename);
         System.out.println(obj);
         
         UserDifineArray s1 = new UserDifineArray(123,"sai1");
         UserDifineArray s2 = new UserDifineArray(124,"sai2");
         UserDifineArray s3 = new UserDifineArray(125,"sai3");
         UserDifineArray s4 = new UserDifineArray(126,"sai4");
 
         
        // System.out.println(s1);
         //System.out.println(s2);
         //System.out.println(s3);
         //System.out.println(s4);
         
                   
         UserDifineArray[] a = new UserDifineArray[4];
         a[0]= s1;
         a[1]= s2;
         a[2]= s3;
         a[3]= s4;
         
         for(UserDifineArray i:a) {
        	 System.out.println(i);
         }
	}

}
