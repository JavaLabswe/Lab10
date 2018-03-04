public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Superman","Cartoon");
		Book b2=new Book();
		
		b2.setTitle("Spider Man");
		System.out.print(b1.getTitle()+"is"+b1.getType());
		System.out.print(b2.getTitle()+"is"+b2.getType());
		

	}

}