package Pack1;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
	
// syntax 1 = datatype [] arrayname = {value1, value2, value3, ...., Value n};
		
		int [] intArray = { 10,20,30,40,50,60};
		
// syntax 2 = datatype [] arrayname = new datatype [no of element to store the array];
		
		int [] intArray2 = new int[5];
		
		intArray2[0] = 500;
		intArray2[1] = 600;
		intArray2[2] = 700;
		intArray2[3] = 800;
		intArray2[4] = 900;
		
		System.out.println(intArray[4]);
		System.out.println(intArray2[4]);
		
		int num = intArray2[1];
		System.out.println(num);
		
		String [] sArray = {"abc","def","pqr","xyz"};
		System.out.println(sArray[5]);
		
		
	}
	
	
	
}
