package Pack1;

public class MethodDemo 
{
 
	//Regular Methods created within the Class body and outside the Main Method
	
	//To create a static method syntax
	
	//public static void methodName()
	//{
		//body/logic
		//}
	
	//To create a Non static method syntax
	
	//public void methodName()
	//{
		// Body / logic
	//}
	
	public static void addNums()
	{
		int a=10;
		int b=20;
		int ans1= a+b;
		System.out.println(ans1);

        System.out.println("calling Non static method in static method");
		MethodDemo ref = new MethodDemo();
        ref.subNums();
		
	}
	
	public void subNums()
	{
		int c=40;
		int d=50;
		int ans2= c-d;
		System.out.println(ans2);
		
		System.out.println("calling static method in non static method");
		//addNums();	
		
	}
	
	public void m3() 
	{
		subNums(); //if we call a Non static method into another non static method then we don't required an Object
		
	}
 	
	public static void main(String[] args) 
	{
        System.out.println("test");
	
        addNums();   // To Call the static method, SYNTAX - MethodName ();
        
     // To Call the Not static method - using reference variable of object - ClassName refVariable = new ClassName()
        
        MethodDemo ref = new MethodDemo();
        
        ref.subNums();
        ref.m3();
        
        
        
        
        
	}

	
	
	
	
	
	
	
}
