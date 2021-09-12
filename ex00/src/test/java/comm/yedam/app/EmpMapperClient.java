package comm.yedam.app;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import comm.yedam.app.board.domain.EmpMapper;
import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/*-context.xml")
public class EmpMapperClient {

	@Autowired EmpMapper dao;
	@Autowired SqlSessionTemplate mybatis;
	
	@Test
	public void mybatisTest() {
		//List<Departments> list = mybatis.selectList("comm.yedam.app.impl.EmpMapper.getDept");
		//log.info(list.get(0).toString());
		
		//map = vo. map은 list<map>, vo는 list<employees> getter써주면 됨
		List<Employees> list = mybatis.selectList("comm.yedam.app.impl.EmpMapper.getEmp", "20");//인터페이스만 만들어주면 이거 칠 필요 없음
		log.info("job_id="+list.get(0).getJobId());
	}
	//스파이 웅앵 해줘서 실행하면 표로 뜸
	
	//@Test @Ignore	//ignore: 테스트 안함 skip
	public void test() {
		log.info(dao.getEmp("10").toString());
	}
	
	//@Test
	public void getTime() {
		log.info("time=="+dao.getTime());
	}
}
