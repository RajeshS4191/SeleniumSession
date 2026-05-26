package Pack1;

public class VariableDemo 
{
	
			
			
			public static void main(String[] args) 
	{
		
				// DataType variablename = value;
				
				byte byteNumber = 127;
				int intNumber = 32456;
				short shortNumber = 457;
				long longNumber = 65456413L;
				float floatNumber = 50.36f;
				double doubleNumber = 325.24;
				char charcharacter = 'R';
				boolean result = true;
				String date = "04/01/1991";
				
				System.out.println(byteNumber);	
				System.out.println(intNumber);
				System.out.println(shortNumber);
				System.out.println(longNumber);
				System.out.println(floatNumber);
				System.out.println(doubleNumber);
				System.out.println(charcharacter);
				System.out.println(result);
				System.out.println(date);
				
				
		System.out.println(VariableTypes.num); //To declare static variable from one class to another class Classname.variablename
		
		int num2 = VariableTypes.num; //To store the Classname.variablename into another variable 
		System.out.println(num2);
		
		VariableTypes V1= new VariableTypes();
		System.out.println(V1.Test1);
		
		
		
	}
	
	
}
