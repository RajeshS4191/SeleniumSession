package Pack1;

public class Operators 
{

	
	

	public static void main(String[] args) 
	{
		
// Pre Increment - First Value of X will be incremented by 1 and then assigned to Y	
		
		int x = 60;
		System.out.println("*****Pre InCrement*****");
		
		System.out.println(x);
		

		
		int y = ++x;
		System.out.println(y);
		System.out.println();
		
// Post Increment - First Value of "a" will be assigned to "b" & then incremented by 1
		
		int a = 40;
		System.out.println("****Post Increment****");
		System.out.println(a);
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println();
		

// Pre Decrement - First Value of "p" will be Decreased by 1 and then assigned to "q"
		
		int p = 80;
		System.out.println("****Pre Decrement****");
		System.out.println(p);
		int q = --p;
		
		
		System.out.println(q);
		System.out.println();
		
// Post Decrement - First Value of "r" will be assigned to "s" & then Decremented by 1	
		
		int r = 30;
		int s = r--;
		System.out.println("****Post Decrement****");
		System.out.println(s);
		System.out.println(r);
		System.out.println();
		
		
		
		
		
		
		
	}
	
	
	
	
}
