
class D
{
	int i=25;
	int j=24;
	int k;
	
	public int showadd(int i,int j)
	{
		return k=i+j;
		
	}
}

class E
{
	int i=25;
	int j=24;
	int k;
	
	public int showadd(int i, int j)
	{
		return k=i+j;
    }
}

class F extends D,E
{
	
}


   




public class MulTry 
{

	public static void main(String[] args) 
	{
		CDE b= new CDE();
	    System.out.println(b.showadd(24,34));
	    System.out.println(b.showadd(50,25));

	}

}
