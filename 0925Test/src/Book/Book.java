package Book;

public class Book {
	private String genre;
	private String name;
	private String dueDate;
	private boolean rental;
	
	public Book() {}
	
	public Book(String genre, String name, String dueDate, boolean rental) {
		super();
		this.genre = genre;
		this.name = name;
		this.dueDate = dueDate;
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

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", name=" + name + ", dueDate=" + dueDate + ", rental=" + rental + "]";
	}
}
