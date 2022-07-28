interface Why
{
	void where();
}


public class AnonInterface {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Why w= new Why()
    		  {
    	  public void where()
    	  {
    		  System.out.print("I know I can");
    	  }
    		  };
      w.where();
	}

}
