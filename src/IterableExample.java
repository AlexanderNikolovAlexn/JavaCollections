
public class IterableExample {

	public static void main(String[] args) {
		
		UrlLibrary urls = new UrlLibrary();
		
		for (String value : urls) {
			System.out.println(value.length());
			//System.out.println(value);
		}

	}

}
