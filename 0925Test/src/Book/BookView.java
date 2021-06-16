package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
	Scanner scanner = new Scanner(System.in);
	BookAccess ba = new BookDAO();

	public void viewAllBooks() {
		ArrayList<Book> list = ba.selectAll();

		for (Book b : list) {
			System.out.println("======================");
			System.out.println("제목 : " + b.getName());
			System.out.println("장르 : " + b.getGenre());
			if (b.isRental()) {
				System.out.println("대여여부 : 대여중");
				System.out.println("대여기간 : ~" + b.getDueDate());
			} else {
				System.out.println("대여여부 : 대여가능");
			}
		}
	}

	public void insertBook() {
		System.out.println("\n책 등록");
		Book book = new Book();

		System.out.print("제목을 입력하세요. > ");
		book.setName(scanner.nextLine());

		System.out.print("장르를 입력하세요. > ");
		book.setGenre(scanner.nextLine());
		book.setDueDate("");
		book.setRental(false);

		boolean joinResult = ba.insert(book);
		if (joinResult) {
			System.out.println("책을 등록하였습니다.\n");
		} else {
			System.out.println("책 등록에 실패했습니다.\n");
		}
	}

	public void updateBook() {
		System.out.println("\n책 정보수정");
		Book book = null;
		ArrayList<Book> list = ba.selectAll();

		System.out.print("수정할 책 제목을 입력하세요. > ");
		String name = scanner.nextLine();
		for (Book b : list) {
			if (b.getName().equals(name)) {
				book = b;
				break;
			}
		}

		if(book == null) {
			System.out.println("해당 제목의 책이 없습니다.");
			return;
		}

		System.out.print("변경할 책 제목을 입력하세요. > ");
		book.setName(scanner.nextLine());
		System.out.print("변경할 장르를 입력하세요. > ");
		book.setGenre(scanner.nextLine());
		System.out.print("변경할 대여기간을 입력하세요.(ex. 20210630) > ");
		book.setDueDate(scanner.nextLine());

		boolean updateResult = ba.update(name,book);
		if (updateResult) {
			System.out.println("책을 수정하였습니다.\n");
		} else {
			System.out.println("책 수정에 실패했습니다.\n");
		}
	}
	
	public void deleteBook() {
		System.out.println("\n책 삭제");

		System.out.print("삭제할 책 제목을 입력하세요. > ");
		boolean deleteResult = ba.delete(scanner.nextLine());
		
		if(deleteResult) {
			System.out.println("책을 삭제하였습니다.\n");
		} else {
			System.out.println("책 삭제에 실패하였습니다.\n");
		}
	}
	public void borrowBook() {
		System.out.println("\n책 대여");

		System.out.print("빌릴 책 이름을 입력하세요. > ");
		boolean borrowResult = ba.borrow(scanner.nextLine());
		
		if (!borrowResult) {
			System.out.println("대여완.\n");
		} else {
			System.out.println("이미 대여중입니다.\n");
		}
	}
	public void backBook() {
		System.out.println("\n책 반납");

		System.out.print("반납할 책 이름을 입력하세요. > ");
		boolean backResult = ba.back(scanner.nextLine());
		
		if (backResult) {
			System.out.println("정상적으로 반납 되었습니다.\n");
		} else {
			System.out.println("대여중이 아닙니다.\n");
		}
	}
	}
