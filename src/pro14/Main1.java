package pro14;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double base=2.5;
         int expo=7;
         double res=4.0;
         
         while(expo!=0) 
         {
        	 res*=base;
        	 expo--;
         }
         
         System.out.println("Result is: "+res);
	}

}
