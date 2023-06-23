package pro14;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double base=2.5;
         int expo=2;
         double res=3.0;
         
         while(expo!=0) 
         {
        	 res*=base;
        	 expo--;
         }
         
         System.out.println("Result is: "+res);
	}

}
