import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "{id: " + id + "; name: " + name + "}";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class StringLenghtComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}
}

public class UsingCollectionCustomObjects {

	public static void main(String[] args) {

		/*
		 * Person p1 = new Person(0, "Bob"); Person p2 = new Person(1, "Sue");
		 * Person p3 = new Person(2, "Mike"); Person p4 = new Person(1, "Sue");
		 * 
		 * Map<Person, Integer> map = new HashMap<Person, Integer>();
		 * map.put(p1, 1); map.put(p2, 11); map.put(p3, 2); map.put(p4, 2);
		 * 
		 * for(Person key: map.keySet()){ System.out.println(key + ":" +
		 * map.get(key)); }
		 * 
		 * Set<Person> set = new HashSet<Person>(); set.add(p1); set.add(p2);
		 * set.add(p3); set.add(p4);
		 * 
		 * System.out.println(set);
		 */
		
		
		// Sorting strings
		List<String> animals = new ArrayList<String>();
		animals.add("elephant");
		animals.add("snake");
		animals.add("lion");
		animals.add("monkey");

		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}
		
		// Sorting integers
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		numbers.add(22);

		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);

			}
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		// Sorting arbitrary class
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(4, "Alex"));
		people.add(new Person(2, "Pesho"));
		people.add(new Person(3, "Sue"));
		
		Collections.sort(people,  new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()){
					return 1;
				} else if (p1.getId() < p2.getId()){
					return -1;
				}
				
				return 0;
			}
		});
		
		for(Person person: people){
			System.out.println(person);
		}
	}
}
