//Lambda expression can only be possible with the functional inteface : interdace with only one method
interface Lambda
{
	void love();
}



public class LambdaExpression
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
     /*  Lambda l = new Lambda()
    		   {
    	   public void love()
    	   {
    		   System.out.println("I love using lambda but not this");
    	   }
    		   }; */
		

			// Lambda l = () -> {System.out.println("I love using lambda");};
		Lambda l = () -> System.out.println("I love using lambda");
             l.love();
	}

}
