import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class DemoHashMap {	
public static void main(String[] args) {
	
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "Hello");
	map.put(2, "World");
	map.put(3, "UPES");
	map.put(4, "AIML");
	map.put(5, "HashMap");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the key that needs to be checked: ");
	int keycheck = sc.nextInt();
	
	System.out.println("HashMap : "+map);
	//checking that a key exists or not!
	System.out.println("Does The key "+ keycheck + " exists: "+ (map.containsKey(keycheck)));
	
	System.out.println("Enter the value that needs to be checked: ");
	String valuecheck = sc.next();
	//checking that a value exists or not!
	System.out.println("Does The Value "+ valuecheck + " exists: "+ (map.containsValue(valuecheck)));
	sc.close();
	
	//all keys from given HashMap
	System.out.println("Keys :");
	System.out.println(map.keySet());
	
	//all values from given HashMap
	System.out.println("Values : ");
	Set<Integer> temp = map.keySet();
	for(Integer t :temp) {
		System.out.println(map.get(t));
	}
  }
}
