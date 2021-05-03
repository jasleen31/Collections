

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


public class Allinone {
	
	

	/**
	 * @param args
	 * @author rtomar
	 * 1->Array list
	 * 2->Vectors********SYNCHRONIZED METHODS REST BOTH ARE SAME
	 * 
	 * 3->HASHSET   UNORDERED,UNIQUE,UNSORTED
	 * 4->TREESET...same as HASHSET...SORTED..needs Comparater obj or else natural ordering
	 * 
	 * 2D array
	 * 
	 * 1->Hashmap
	 * 2->TreeMap
	 * 3->HashTable****SYNCHRONIZED METHODS REST SAME
	 * 4->properties both STrings 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		//ARRAYS
		Employee e1[]=new Employee[10];
		populate(e1);
		for(Employee e:e1)
		{
			System.out.println(e.toString());
		}
		//SORTED ARRAY
		Arrays.sort(e1);
		System.out.println("Sorted");
		for(Employee e:e1)
		{
			System.out.println(e.toString());
		}
		
		
		//ARRAYLIST
		List<Employee> l1=new ArrayList<Employee>();
		for(int i=0;i<e1.length;i++)
		l1.add(e1[i]);
		
		System.out.println("From ArrayList");
		
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
		
		//VECTOR
		Vector<Employee> l2=new Vector<Employee>();
		l2.addAll(l1);
		//ENUM & VECTOR
		Enumeration<Employee> val;
		val=l2.elements();
		System.out.println("From Vector via enum");
		while(val.hasMoreElements())
		{
			System.out.println(val.nextElement().toString());
		}
		
		//VECTOR Iterator
		System.out.println("From vector via iterator");
		itr=l2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().toString());
		
		//HASHSET
		
		HashSet<Employee> s1=new HashSet<Employee>();
		s1.addAll(l1);
		System.out.println("From hashset ");
		itr=s1.iterator();
		while(itr.hasNext())
		System.out.println(itr.next().toString());

		//TREESET
		TreeSet<Employee> s2=new TreeSet<Employee>();
		s2.addAll(l1);
		System.out.println("From TREEset NORMAL w/o Sorting but using Natural ordering");
		itr=s2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().toString());
		
		//TREESET SORTED COMPARATOR CLASS EXAMPLE
		
		TreeSet<Employee> s3=new TreeSet<Employee>(new Employee());
		s3.addAll(l1);
		System.out.println("From TREEset WITH Sorting using comparator");
		itr=s3.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().toString());
		
		
		//HASHMAP
		
		HashMap<Integer, Employee> hm=new HashMap<Integer, Employee>();
		//hm.put(key, value)
		for(int i=0;i<10;i++)
			hm.put(e1[i].id, e1[i]);
		System.out.println("Hashmap implementation ");
		Set ss=hm.keySet();
		itr=ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(hm.get(itr.next()));
		}
		
		System.out.println("What if i print keys in HashMap"+hm.keySet());
		System.out.println("What if i print values in HashMap"+hm.values());
		
		//Treemap SEE ITS SORTED BASED ON KEYS SET
		
		TreeMap<Integer, Employee> tm=new TreeMap<Integer, Employee>();
		for(int i=0;i<10;i++)
			tm.put(e1[i].id, e1[i]);
		System.out.println("Treemap implementation ");
		ss=tm.keySet();
		itr=ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(tm.get(itr.next()));
		}
		System.out.println("What if i print keys in TreeMap"+tm.keySet());
		System.out.println("What if i print values in TreeMap"+tm.values());
		//PRoperties
		Properties pp=new Properties();
		for(int i=0;i<10;i++)
		pp.setProperty((Integer.toString(e1[i].id)), e1[i].name);
		
		System.out.println("Properies Output");
		for(int i=0;i<10;i++)
			System.out.println(pp.getProperty((Integer.toString(e1[i].id))));
		
	
		
		// TODO Auto-generated method stub

	}

	private static void populate(Employee[] e1) {
		Double t=Math.random();
		for(int i=0;i<10;i++)
		{e1[i]=new Employee();
			t=Math.random();
			e1[i].id=(int) (100*t);
//			t=Math.random();
//			e1[i].name="Mr.Xyz"+Math.round(t*100);
		}
		e1[0].name="RAM";
		e1[1].name="Shyam";
		e1[2].name="Lakshman";
		e1[3].name="Sita";
		e1[4].name="Hanuman";
		e1[5].name="Raavan";
		e1[6].name="RAM";
		e1[7].name="Soopnakha";
		e1[8].name="Sugreev";
		e1[9].name="Dashrat";
		// TODO Auto-generated method stub
		
	}
	class Employee{
		int id;
		String name;
		public Employee(int id, String name) {
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


}