class Ice
{
	int num1;//Instance variables
	int num2;
	
	public Ice(int num1, int num2)
	{
		this.num1=num1;  
		this.num2=num2;
		
	}
	public void solid()
	{
		System.out.println("The values of num1 and num2 are:" + num1 + num2);
	}

}
public class Keywordthis
{

	public static void main(String[] args) 
	{
		Ice obj = new Ice(4,5);
		System.out.println(obj.num1);
		obj.solid();
		

	}

}
