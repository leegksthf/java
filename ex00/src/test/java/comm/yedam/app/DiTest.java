package comm.yedam.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/*-context.xml")
public class DiTest {
	//IoC(역제어): 객체관리를 컨테이너가 함
	//DI : dependency Injection
	@Autowired Employees emp;	//new 객체생성 없이 컨테이너에서 주입받음
	@Test
	public void test1() {
		emp.getEmployeeId();
		//log.info(emp.getEmployeeId()); bean 추가 안해주고 employees에서 component써주면 됨
	}
}
