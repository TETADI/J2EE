class Arguments
{
	public int teja(int...n)
	{
		int sum=0;
	      for(int j:n)
	      {
		    sum = sum + j;
	        
		
	      }
	      return sum;
	
		
		
	}
}
public class EnhancedArguments
{

	public static void main(String[] args)
	{
		
		Arguments obj = new Arguments();
		obj.teja(25,34,675,3453,2345);
		System.out.println(obj.teja(25,34,675,3453,2345));
	}

}
