import java.util.HashSet;
import java.util.Iterator;
public class DemoHashSet {
	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("first");
		set1.add("second");
		set1.add("third");
		set1.add("fourth");
		set1.add("fifth");
		System.out.println("set1: "+set1);
		HashSet<String> set2 = new HashSet<String>();
		set2.add("hello");
		set2.add("everyone");
		set2.addAll(set1);
		System.out.println("set2: "+set2);
		//searching elements
		System.out.println(set2.contains("third"));
		//deleting entries all at once
		set1.clear();
		System.out.println("After deleting all elements from set1: "+set1);
		
		HashSet<Student> hs = new HashSet<Student>();		
		Student s1 = new Student(1,"Ram");
		Student s2 = new Student(2,"Alex");
		Student s3 = new Student(3,"King");
		Student s4 = new Student(4,"Rex");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		Iterator<Student> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Searching user-defined Objects:");
		for (Student name: hs) {
			name.toString();
			if(name == s2) {
				System.out.println(name +" is present in the set.");
			}
		}
	}
}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id ;
		this.name= name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "id: "+id+" name: "+name;
	}
}
