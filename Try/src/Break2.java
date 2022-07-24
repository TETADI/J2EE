
public class Break2 
{

	static void abc()// function
	{
	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
			continue; //break;
			 
		}
		System.out.println("The Output was:" + i);
	}
	}
	
	
	static void def()
	{
	for(int j=1;j<=10;j++)
	{
		if(j==6)
		{
			break;
			 
		}
		System.out.println("The Output was:" + j);
	}
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		abc();
		def();

	}

}
