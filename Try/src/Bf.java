//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.AutoCloseable;

public class Bf 
{

	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Enter the number");
		try(InputStreamReader is = new InputStreamReader(System.in);
				BufferedReader br =  new BufferedReader(is);)
		{

			//InputStreamReader is = new InputStreamReader(System.in);
		//	BufferedReader br =  new BufferedReader(is);
		
		int n = Integer.parseInt(br.readLine());
			
		
		System.out.println(n);
		}
		
		finally
		{
			System.out.println("Please enter an Integer for output!!");
		}

	}

	

}
