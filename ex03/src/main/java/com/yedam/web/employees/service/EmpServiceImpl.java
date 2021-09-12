package com.yedam.web.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.web.employees.domain.EmpVO;
import com.yedam.web.employees.mapper.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getList() {
		return empMapper.getList();
	}

	@Override
	public int update(EmpVO emp) {
		return empMapper.update(emp);
	}

	@Override
	public int delete(EmpVO emp) {
		return empMapper.delete(emp);
	}

	@Override
	public EmpVO emp(EmpVO vo) {
		return empMapper.emp(vo);
	}

	
}
