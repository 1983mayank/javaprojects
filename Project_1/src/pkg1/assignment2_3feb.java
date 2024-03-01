package pkg1;
//(10/2)+2)-2)+2)/2)

public class assignment2_3feb {
	public float div(float a, float b)
	{
		float c;
		c=a/b;
		return c;
		
	}
	public float sum(float g, float h) 
	{
		float i;
	 i=g+h;
	 return i;
	}
	public float sub(float r, float s)
	{
		float t;
		t=r-s;
		return t;
	}
	public static void main(String[] args) {
		assignment2_3feb ob=new assignment2_3feb();
		float divresult=ob.div(10, 2);
		float sumresult=ob.sum(divresult, 2);
		float subresult=ob.sub( sumresult,2);
		float sumresult2=ob.sum (subresult,2);
		float divresult2=ob.div(sumresult2,2);
		System.out.println("Final result is "+ divresult2 );
	}
}


