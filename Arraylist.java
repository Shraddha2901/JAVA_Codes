package pro;
import java.util.*;
public class Arraylist 
{
      public static void main(String[] args) 
      {
		List<String>lst=new ArrayList<>();
		lst.add("C");
		lst.add("C++");
		lst.add("DSA");
		lst.add("JAVA");
		System.out.println("Displaying array list");
		for(String S:lst)
		{
			System.out.println(" "+S);
		}
		lst.remove("C++");
		System.out.println("After removing C++ from list");
		for(String S:lst)
		{
			System.out.println(" "+S);
		}
	 }
}
