class Tatayya
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class Daddy extends Tatayya
{
	public int sub(int i,int j)
	{
	    return i-j;
	}
}
class Me extends Daddy
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}



public class Inheritance
{

	public static void main(String[] args)
	{
		Me obj = new Me();
		int k = obj.add(25,25);
		int l = obj.sub(75,25);
		int m = obj.mul(25,2);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		
		
		
	}

}
