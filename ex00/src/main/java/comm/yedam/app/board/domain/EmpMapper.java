package comm.yedam.app.board.domain;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import comm.yedam.app.Departments;

@Repository	//DAO
public interface EmpMapper {
	List<Map> getEmp(String deptid);
	List<Departments> getDept();
	
	@Select("SELECT sysdate from dual")		//쿼리가 간단하면 매퍼에 같이 사용 가능. 길어지면 xml파일 주로 ㅅ사용함.
	public String getTime();
}