package Pack1;

public class MethodDemo1 
{

	public void m1() 
	{
		MethodDemo.addNums();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		//SYNTAX to call static method of another class
		//ClassName.MethodName();
		
		//MethodDemo.addNums();
		
		
		//SYNTAX to call Non static method of another class
		//Object of that class in which non static method is Present.
		
		//MethodDemo MD = new MethodDemo();
		
		//MD.subNums();
		
		MethodDemo1 Md2= new MethodDemo1();
		Md2.m1();
		
		
		
		
		
		
		
		
	}
	
	
	
		
	
}
