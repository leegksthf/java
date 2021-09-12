package com.yedam.web.employees.service;

import java.util.List;

import com.yedam.web.employees.domain.EmpVO;

public interface EmpService {
	
	//단건조회
	public EmpVO emp(EmpVO vo);
	
	//전체조회
	public List<EmpVO> getList();
	
	//수정
	public int update(EmpVO emp);
	
	//삭제
	public int delete(EmpVO emp);
}
