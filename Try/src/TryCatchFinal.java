
public class TryCatchFinal 
{

	public static void main(String[] args) 
{
		int i=8;
	      //int j=2;
		int j=9;
	try
	{
      
      int c = i/j;
      if(c==0)
    	  throw new TejaException();
    	  
      
      System.out.println("The output is:"+ c);
      
    }
	//catch(Exception e)
	catch(TejaException e)
	{
		 System.out.println("Error");
	}
    finally
    {
    	System.out.println("Bye......");
    }
}

}
