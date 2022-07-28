import java.util.Collection;
import java.util.ArrayList;
public class CollectionLearningArrayList
{

	public static void main(String[] args)
	{
		Collection <String> fruit = new ArrayList<>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Cinemon");
		fruit.add("Dounut");
		
		System.out.println(fruit);
		fruit.remove("Cinemon");
		System.out.println(fruit);
		System.out.println(fruit.contains("Apple"));
		//Collection <String> = new ArrayList<>();
		
		//Collection <String> fruit = new ArrayList<>();

	}

}
