import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Name implements Comparable<Name>{
	
	private String name;

	public Name(String name) {		
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Name o) {
		
		int len1 = this.name.length();
		int len2 = o.name.length();
		
		if(len1 > len2) {
			return 1;
		} else if(len1 < len2){
			return -1;
		}
		
		return name.compareTo(o.name);
	}
		
}

public class NaturalOrderingExample {

	public static void main(String[] args) {
	
		List<Name> list = new ArrayList<Name>();
		Set<Name> set = new TreeSet<Name>();
		
		//adding elements to collections
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		System.out.println("Showing list!");
		showElements(list);
		System.out.println("Showing set!");
		showElements(set);
		
	}
	
	private static void addElements(Collection<Name> col){
		col.add(new Name("Joe"));
		col.add(new Name("Sue"));
		col.add(new Name("Alex"));
		col.add(new Name("Clare"));
		col.add(new Name("Mike"));
	}
	
	private static void showElements(Collection<Name> col){
		for(Name element: col){
			System.out.println(element);
		}
	}
}
