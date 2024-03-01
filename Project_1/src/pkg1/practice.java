package pkg1;
//////constructor practice using default, 1 ,2 parameterized constructor

public class practice {
	public practice() 
	{

		System.out.println("default constructor");
		
		
		
	}
	public practice(int a)
	{
		this();
		System.out.println("one parameterized constructor");
		
}
	
	

	public practice(int a, int b)
	
	{
		this(456);
		
		System.out.println("two parameterized constructor");
}
	public static void main(String[] args) {
		practice ob=new practice(123, 789);
//		practice ob1=new practice ();
//		practice ob2=new practice(456);
	}
}

	

