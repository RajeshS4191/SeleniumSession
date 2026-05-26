package Pack1;

public class Loppsdiscussion 
{

	public static void main(String[] args) 
	{
		
		System.out.println("loop");
		System.out.println("loop");
		System.out.println("loop");
		System.out.println("loop");
		System.out.println("loop");
	
//        SYNTAX	
		
//		while(boolean condition)
//		{
			//Code to Repeat / Iterate
//		}
	
		System.out.println();
		System.out.println("****While Loop*****");
		System.out.println();
		
		int num = 1;
		
		while (num <= 5) //1, 2
		{
			System.out.println("loop :"+num);
			num++; // 2, 3, 4, 5, 6
			
			int ans = num + 100; //102, 103
			
			if (ans == 103) // False, true
			{
			break; //Stop the code repetition / Break the loop
			}
			
			
			
			}
			
			
		
		System.out.println("Out Of Loop");
		
		System.out.println();
		System.out.println("*****Do While Loop*****");
		System.out.println();
		
//        SYNTAX
		
//		do
//		{
			//code to Repeat // Iterate
//		}
//	while (Boolean Condition)
		
		int num2 = 1;
		
		do
		{
			System.out.println("Loop : " + num2);
			num2++;	
		}
		while (num2 <= 5);
		
		System.out.println("Out of Do While Loop");
		
		System.out.println();
		System.out.println("*****For Loop*****");
		System.out.println();
	
//         SYNTAX
		
//		for (initialization; Condition; increment/Decrement)
//		{
	       //Code to Repeat/Iterate
//   	}
	
	for (int num3 = 1; num3<=5; num3++)
	{
		System.out.println("Loop : "+num3);
	}
	 System.out.println("Out of For Loop");
	 
	    System.out.println();
		System.out.println("*****For Each Loop*****");
		System.out.println();
	
		int [] intArray = { 100, 200, 300, 400, 500 };
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println();
		System.out.println("*****For Loop*****");
		System.out.println();
		
		for (int i = 0; i<=4; i++)
		{
			System.out.println(intArray[i]);
		}
		 System.out.println("out of Loop");
		 
		 
		   System.out.println();
			System.out.println("*****For Each Loop*****");
			System.out.println();
			
// SYNTAX

// for (DataType Variable : ArrayName/Collection)
//			{
			//Code to Repeat / Iterate
//	        }
		
		for (int var : intArray )
		{
			System.out.println(var);
		}
		
		
		
		
		}
	
	
	
	
	
	
	
	}
	
	

