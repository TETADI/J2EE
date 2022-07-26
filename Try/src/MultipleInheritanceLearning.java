class A 
{
	int i=25;
	int j=24;
	int k;
	
	public int showadd(int i,int j)
	{
		return k=i+j;
		
	}
}

class B extends A
{

	
	public int showsub(int i, int j)
	{
		return k=i-j;
    }
}
public class MultipleInheritanceLearning
{

	public static void main(String[] args)
	{
	    B b= new B();
	    b.showadd(24,34);
	    b.showsub(50,25);
		
	}

}
