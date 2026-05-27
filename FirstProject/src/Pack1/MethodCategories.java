package Pack1;

public class MethodCategories 
{

	public static void addition(int num1, int num2, String str) //Method with Argument
	{
//		int a = 10;
//		int b = 20;
		int ans = num1+num2;
		System.out.println(ans);
		System.out.println(str);
		
	}
	
	public static void m2(String str)
	{
		String s1 = "ABC";
		System.out.println(s1 + str);
	}
	
	           //void - Nothing
	 public static int multplication() //Method with return type
	 {
		 int a = 10;
		 int b = 20;
		 int ans = a*b;
//		 System.out.println(ans);
		 
		 return ans;
		 
	 }
	 
	 public static String getAccountName(int AccountNumber) // Method with Argument & Return Type
	 {
		 String name = "";
		 
		 if (AccountNumber == 1)
		 {
			 name = "ABC";
		 }
		 else
		 {
			 name = "PQR";
		 }
		 
		 
		 return name;
		 
		 
	 }
	
	
	public static void main(String[] args) 
	{
	
		addition(5,6, "AB");
		addition(11,15, "RS");
		addition(22,32, "EEE");
		m2("PQR");
		
		int mul = multplication();
		System.out.println(mul);
		
		String s1 = getAccountName(1);
		System.out.println(s1);
	
		
	}
	
}
