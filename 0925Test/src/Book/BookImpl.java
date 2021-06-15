package Book;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookImpl implements BookAccess {
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Map<String , Book> map = new HashMap<>(); 
	DecimalFormat df = new DecimalFormat("000");
	private Calendar now = Calendar.getInstance();
	
	@Override
	public void borrow() {									
		try {
			String bname;
			System.out.println("빌릴 책 이름을 입력하세요 : ");
			bname = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {
				String num = it.next();
				Book vo = map.get(num);
				
				if (vo.getName().startsWith(bname)) {
					if(vo.isRental()) {
						System.out.println("이미 대여중입니다.");
						break;
					}
					vo.setStock(vo.getStock()-1);
					System.out.print(num + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getGenre() + "\t");
					System.out.print(vo.getStock() + "\n");
					System.out.println("대여완료");
					String a = String.format("%1$tF %1$tA", now);
					System.out.print("대여시간 : "+a);
					System.out.print("반납시간 : "+(a+7));
					System.out.println();
					vo.setRental(true);	
				}
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void back() {									
		// 반납 할때 재고를를 존재로 확인
		System.out.println("반납할 책 이름입력");
		String s = scan.next();
		Iterator<String> it = map.keySet().iterator();

		// 키값 가져오기

		while (it.hasNext()) {
			String key = it.next();
			Book value = map.get(key);
			
			if (s.equals(value.getName())) {
				if (!value.isRental()) {
					System.out.println("대여중이 아닙니다.");
					
				} else if (value.isRental()) {
					System.out.println("정상적으로 반납 되었습니다.");
					value.setStock(value.getStock()+1);
					value.setRental(false);
					
				}
			}
		}

		// if (!isExist2)
		// System.out.println("도서 존재 X");
	}

	@Override
	public  bookSearch() {								
		Iterator<String> it = map.keySet().iterator();
		int setnum=0;
		int count=0;
		
		try {
			System.out.println("검색할 책 이름 : ");
			String s1 = br.readLine();
			
			while (it.hasNext()) {
				String s2=df.format(++setnum);
				String key = it.next();
				Book bookvo = map.get(key);
				if (bookvo.getName().indexOf(s1)>-1) {
					System.out.print(key+"\t");
					System.out.print(bookvo.getGenre()+"\t");
					System.out.print(bookvo.getName()+"\t");
					System.out.print(bookvo.getStock()+"\n");
					count++;
				}
			}
			if (count==0) {
				System.out.println("검색된 책이 없습니다.");
				return;
			}
			System.out.println();
			System.out.println("총 "+count+"건의 책이 검색되었습니다.");
			System.out.println();
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public ArrayList<Book> selectAll() {							
		Iterator<String> it=map.keySet().iterator();
		while (it.hasNext()) {
			String key=it.next();
			Book value=map.get(key);
			System.out.print(key+"\t"+value.getGenre()+"\t"+value.getName()+"\t"+value.getStock()+"\n");
		}
	}

	@Override
	public void update() {								
		System.out.println("\n책 정보 수정");
		
		try {
			String name;
			System.out.print("책 이름을 입력하세요.");
			name = br.readLine();
			
			Book vo = map.get(name);
			if(vo.getName()==null) {
				System.out.println("존재하지 않는 이름입니다.");
				return;
			}
			System.out.println("수정할 책 이름을 입력하세요.");
			vo.setName(br.readLine());
			
			System.out.println("수정 완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println();
	}

	@Override
	public void bookAdd() {									
		System.out.println("\n 책을 등록합니다.");
		
		try {
			String code;		//code값이 String값임 
			Book vo=new Book();
			
			System.out.print("코드를 입력하세요.");
			code=br.readLine();
			
			if(map.containsKey(code)) { //코드가 있으면 (키값이있으면) 빠져나가고 
				System.out.println("등록된 책입니다.\n");
				return;
			}
			System.out.print("책 이름을 입력하세요.");
			vo.setName(br.readLine());
			
			
			System.out.print("책 장르를 입력하세요.");
			vo.setGenre(br.readLine());
			
			vo.setStock(vo.getStock()+1);

			map.put(code, vo); //map은 put이 데이터 추가 / arraylist는 add데이터 추가 
			System.out.println("책이 등록되었습니다\n");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void bookDelete() {									
		System.out.println("삭제할 책의 이름 입력하세요.");
		
		String s = scan.next();
		Iterator<String> it = map.keySet().iterator();


		while (it.hasNext()) {
			String key = it.next();
			Book value = map.get(key);

			if (s.equals(value.getName())) {
				map.remove(key);
				System.out.println(s+"책 삭제 완료");
				value.setStock(value.getStock()-1);
			}
		}
	}
	
	

}