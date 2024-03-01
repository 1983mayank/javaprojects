package pkg1;
//output should be in below sequence using this keyword;
//three parameterized constructor
//default constructor
//one parameterized constructor
//two parameterized constructor
//four parameterized constructor

public class Assignment1_4feb {
	
public Assignment1_4feb() 
{
	this(1,2,3);

  System.out.println("default constructor");
}
Assignment1_4feb(int a)
{

  System.out.println("one parameterized constructor");	
}

Assignment1_4feb(int a, int b)
{
	System.out.println("two parameterized constructor");
	
	}
Assignment1_4feb(int a, int b, int c)
{

	System.out.println("three parameterized constructor");
}

Assignment1_4feb(int a, int b, int c, int d)
{
	this(1,2);
	System.out.println("four parameterized constructor");
}
public static void main(String[] args) 
{
	Assignment1_4feb ob=new Assignment1_4feb();
	Assignment1_4feb ob2=new Assignment1_4feb(1);
	Assignment1_4feb ob4=new Assignment1_4feb(2,3,4,5);

}



	}


