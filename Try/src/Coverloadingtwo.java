
class Tea
{
	private int cost;
	int num1=17;
	
	public Tea()
	{
		cost=256;
		 num1 =15;
	}
	
	public Tea(int n)
	{
		cost=n; 
		num1=20;
	}
	
	public void display() 
	{
		System.out.println("The number is:" + cost);
		
	}
	
	
}
public class Coverloadingtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea obj1 = new Tea();
		Tea obj2 = new Tea(25);
		System.out.println(obj1.num1);
		
		obj1.display();
		obj2.display();

	}

}
