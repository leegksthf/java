package comm.yedam.app;

public class BuilderTest {

	public static void main(String[] args) {
		
		Member member = Member.builder().id("kitty").pw("1234").build();		//생성자 대체

	}

}
