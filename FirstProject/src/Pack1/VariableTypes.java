package Pack1;

public class VariableTypes 
{
    //Static Variable (class variable or Global variables) - within class body and outside the main method
	
	static int num =10;
	static int num1; //Variable Declaration
	static byte num2;
	static short num3;
	static long num4;
	static float num5;
	static double num6;
	static boolean result;
	static char Char;
	
	int Test1 = 100; //Non Static Variable (Class Variable or Global Variable)
	int Test2;
	byte Test3;
	short Test4;
	long Test5;
	float Test6;
	double Test7;
	boolean result1;
	char Char1;
	
	int Num10=80;
	
	public void M2() 
	{
	System.out.println(num);
	System.out.println(Test1); //Calling Non Static Variable into Non static Method 
	
	int Rajesh2 = 60; //Local Variable -
	int Rajesh3; // Local Variables never get a default value
	int Num10= 700;
	System.out.println(Num10); // Local Variable
//	VariableTypes V2 = new VariableTypes();
//	System.out.println(V2.Num10);
	System.out.println(this.Num10); //this keyword is used to refer Non Static Variable of current Class
	
	}
	
	public static void M3() 
	{
		
		System.out.println(num);
//		System.out.println(Test1); // Object Needed
		int Rajesh3 = 30; //Local Variable
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println(num);
		
		VariableTypes V1 = new VariableTypes();
		System.out.println(V1.num);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(result);
		System.out.println(Char);
		
		System.out.println(V1.Test1);
		System.out.println(V1.Test2);
		System.out.println(V1.Test3);
		System.out.println(V1.Test4);
		System.out.println(V1.Test5);
		System.out.println(V1.Test6);
		System.out.println(V1.Test7);
		System.out.println(V1.result1);
		System.out.println(V1.Char1);
		
		int Rajesh1 = 40; // Local Variable (method Variable) - Present within Method Boundary)
		System.out.println(Rajesh1);
		
		V1.M2();
		System.out.println(V1.Num10);
				
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
