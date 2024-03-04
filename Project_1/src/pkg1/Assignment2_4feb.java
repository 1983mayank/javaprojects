package pkg1;
//three parameterized method
//four parameterized method
//default parameterized method
//one parameterized method
//two parameterized method (using this keyword)

public class Assignment2_4feb {

	public void m() 
	{
	
		
		System.out.println("default method");
	}
	
	public void m1(int a) 
	{
		
		System.out.println("one parameterized method");
	}
		
	public void m2(int a, int b) 
	{
	
		System.out.println("two parameterized method");
	}
	public void m3(int a, int b, int c) 
	{
	
	System.out.println("three parameterized method");
	}
	public void m4(int a, int b, int c, int d) 
	{
		this.m3(1, 2, 3);
	
		System.out.println("four parameterized method");
		this.m();
		this.m1(1);
		this.m2(1, 2);
		
	}
	public static void main(String[] args) 
	{
		Assignment2_4feb ob=new Assignment2_4feb();
		ob.m4(1, 2, 3, 4);
		//testing
	}
	
}
	
	
// centralized repository : https://github.com/1983mayank/javaprojects.git
//user name : 1983mayank
//password token : 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
