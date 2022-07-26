class Wrap
{
	public void normal()
	{
		int x=5;
		System.out.println(x);
	}
	
	public void autobox()
	{
	 int y=25;
	 Integer i = new Integer(y);
	 System.out.println(i);
	}
	
	public void box()
	{
		int f=34;
		Integer u = f;
		System.out.println(u);
		
	}
}









public class WrapperClass {

	public static void main(String[] args) {
		Wrap w = new Wrap();
		w.normal();
		w.autobox();
		w.box();

	}

}
