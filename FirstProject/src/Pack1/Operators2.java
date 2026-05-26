package Pack1;

public class Operators2 
{

	
	public static void main(String[] args) 
	{
	   
		int x = 60;
		int y = 50;
		
		boolean result = x>y; // Greater Than
		System.out.println(result);
		
		boolean result1 = x<y; // Less Than
		System.out.println(result1);
		
		boolean result2 = x>=y; //Greater than or equal to (x is greater or equal to y)
		System.out.println(result2);
		
		boolean result3 = x<=y; //Less than or equal to (x is Less or equal to y
		System.out.println(result3);		
		
		boolean result4 = (x==y); //Check for Equality 
		System.out.println(result4);
		
		boolean result5 = (x!=y); //Check for Non Equality 
		System.out.println(result5);
		
		boolean result6 = (x>y) && (x!=100); //Logical AND Operator - All the conditions must be true
		System.out.println(result6);
		
		boolean result7 = (x>y) || (x==100); // Logical OR Operator - One of the condition must be true
		System.out.println(result7);
		
	}
	
}
