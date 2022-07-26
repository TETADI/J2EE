///This is Single dimensin array 







class First
{
//int i[]= {3,4,5,6,7,7};
//i[0]=1;
//i[1]=2;
//i[2]=3;
	

	
	public void hi()
	{
		int i[]= new int[3];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		
		
	    for(int j=0;j<i.length;j++)
	     {
		
	       System.out.println("The output was:" + i[j]);
	
	     }
	}
}



public class LearnArray
{

	public static void main(String[] args) 
	{
		
		First obj = new First();
		obj.hi();
	
	
	}

}
;