package Pack1;

public class VariableDemo2 
{
    int num = 80;
    static int num2 = 400;
    
	
	
	
	public static void main(String[] args) 
	{
		
		VariableDemo2 V1 = new VariableDemo2();
		System.out.println(V1.num);
		
		V1.num = 90;
		System.out.println(V1.num);
		
		VariableDemo2 V2 = new VariableDemo2();
		System.out.println(V2.num);
		V2.num = 700;
		System.out.println(V2.num);
		
		VariableDemo2 V3 = new VariableDemo2();
		System.out.println(V3.num);
		
		System.out.println();
		System.out.println("****static variable****");
		System.out.println();
		
		System.out.println(V1.num2);
		V1.num2 = 300;
		System.out.println(V1.num2);
		
		System.out.println(V2.num2);
		
		
		
		
		
		
		
		
		
	}
}
