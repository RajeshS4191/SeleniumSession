package Pack1;

public class Loops2 
{

	public static void main(String[] args) 
	{
	
	for (int num = 1; num<=5; num++) //1, 2, 3
		{
			
			if(num == 3) //False, False, True
			{
				continue; // Skip the Current Iteration/Condition and jump into next one
				//break;
			}
			
			System.out.println("loop :"+num);
			
		}
		
		
		
	}
	
	
	
}
