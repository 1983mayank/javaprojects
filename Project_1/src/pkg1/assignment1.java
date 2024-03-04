package pkg1;
//((((10+2)+2)-2)*2)/2)

public class assignment1 { 

	public int sum(int a,int b)
	{
	
		int c;
	    c=a+b;
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		return f;
	}
	public int multi(int g, int h)
	{
		int i;
		i=g*h;
		return i;
		
	}
	public void div (int r, int s)
	{
		int t;
		t=r/s;
		System.out.println("final result value is "+ t);
	}
	public static void main(String[] args) 
	{
		assignment1 ob=new assignment1();
	    int sumresult=ob.sum(10, 2);
	    int sumresult2=ob.sum(sumresult,2);
	    int subresult=ob.sub (sumresult2,2);
	    int multiresult=ob.multi(subresult,2);
	    ob.div( multiresult,2);
		
		
	    
	}
		
	}


