class Trail 
{
	public void  bye()
	{
		System.out.println("Hello son,How you doing");
	}
}


/*class Real extends Trail
{
	public void  bye()
	{
		//super.bye();
		System.out.println("Hello son,How you doing mate");
	}
 */








public class AnonymousTrail {

	public static void main(String[] args) {
		Trail r = new Trail()
		//Real r = new Real()
				{
			public void  bye()
			{
				//super.bye();
				super.bye();
				System.out.println("Hello son,How you doing mate");
			}
			
				};
		r.bye();

	}

}
