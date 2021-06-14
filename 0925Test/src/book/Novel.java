package book;

public class Novel extends Book {

	@Override
	public int getLateFees(int days) {
		

		days = 700;
		return 3 * days;
	}
}
