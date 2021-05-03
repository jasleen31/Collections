import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("Hello");
		arl.add("UPES");
		arl.add("DDN");
		arl.add("CSE");
		arl.add("AIML");
		
		System.out.println("Printing elements in ArrayList using Iterator : ");
		Iterator<String> itr = arl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// duplicate object of an ArrayList instance
		ArrayList<String> arl2 = (ArrayList<String>) arl.clone();
		
		System.out.println("Printing elements of ArrayList 2 :");
		Iterator<String> itr2 = arl2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		//reverse ArrayList content
		Collections.reverse(arl);
		System.out.println("After reversing: ");
		System.out.println(arl);
		
	}

}
