


class TwoMthodOverload
{
	public void first(int i,int j)
	{
		System.out.println(i+j);
	}
	public void first(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	 public void first(double i,double j)
	{
		System.out.println(i+j);
	}
	/*public void first(int i,int j,int k,int l,int m)
	{
		System.out.println(i+j+k+l+m);
	} */
}

public class methodOverloadiingConcept
{

	public static void main(String[] args) 
	{
		TwoMthodOverload obj1 = new TwoMthodOverload();
		obj1.first(1,2);
		obj1.first(1,2,3);
		obj1.first(1.0,2.7);
		//obj1.first(1,2,3,4,5);
		

	}
	

}
