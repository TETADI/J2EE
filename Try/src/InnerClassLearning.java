class OuterClass
{
	int i=5;
	int j=4;
	
	public void outfunction()
	{
		System.out.println("The output was:"  + j  + i);
	}
	
	
	
class InnerClass
	{
		int k=3;
		int l=2;
		
		public void infucntion()
		{
			System.out.println("The output was:"  + l  + k);
		}
	}
	
}


public class InnerClassLearning 
{

	public static void main(String[] args) 
	{
		OuterClass obj = new OuterClass();
		OuterClass.InnerClass obj1 = obj.new InnerClass();
		
		obj.outfunction();
		obj1.infucntion();
		
		
		 
	}

}
