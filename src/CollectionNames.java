
public enum CollectionNames {
	ARRAYLIST("ArrayList"), LINKEDLIST("LinkedList");
	
	private String name;
	
	private CollectionNames(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
