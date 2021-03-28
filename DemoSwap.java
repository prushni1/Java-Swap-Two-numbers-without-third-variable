import java.util.Scanner;


public class DemoSwap {

	/*
        x = x+y;
        y=x-y;
        x=x-y;
        
        */
	
	/*
	x = x*y;
        y=x/y;
        x=x/y;
	*/
	
	public static void main(String args[])
	{	
	
		int value1=50,value2=100;
		
		Scanner scan=new Scanner(System.in);
	 
		 System.out.println( "Before Swap : Value1= "+value1 +"\n  Value2= "+value2  );

		 value1=value1*value2;
		 value2=value1/value2;
		 value1=value1/value2;
		 
		 System.out.println( "AFTER Swap : Value1= "+value1 +"\n  Value2= "+value2  );

	}
}
