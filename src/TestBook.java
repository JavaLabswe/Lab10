public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book("Superman","Cartoon");
		Book b2 = new Book();
		b2.setTitle("Spiderman");
		System.out.println(b1.getTitle() + " is " + b1.getType());
		System.out.println(b2.getTitle() + " is " + b2.getType());
	}
}
