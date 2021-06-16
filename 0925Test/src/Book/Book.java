package Book;

public class Book {
	private String genre;
	private String name;
	private int stock;
	private boolean rental;
	
	public Book() {}
	public Book(String genre, String name, int stock, boolean rental) {
		super();
		this.genre = genre;
		this.name = name;
		this.stock = stock;
		this.rental = rental;
	}
	
	public boolean isRental() {
		return rental;
	}
	
	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", name=" + name + ", stock=" + stock + ", rental=" + rental + "]";
	}
	
}
