package pkg1;

public class Arithmetic {
	public int sum(int a,int b)
	{int c;
	c=a+b;
	System.out.println("sum result is " +c);
	return c;
		
	}
	public int subtraction(int x1, int x2)
	{
		int x3;
		x3=x1-x2;
		System.out.println("sub result is " + x3);
		return x3;
	}
	public void multi(int r,int s)
	{
		int result;
		result=r*s;
		System.out.println("Final result is "+ result);
	}
	public static void main(String[] args) 
	{
		Arithmetic ob=new Arithmetic();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.subtraction(10, 2);
		ob.multi(sumresult, subresult);		
				
	}
}

