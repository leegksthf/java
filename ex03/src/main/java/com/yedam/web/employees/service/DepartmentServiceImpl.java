package com.yedam.web.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.web.employees.domain.DepartmentsVO;
import com.yedam.web.employees.domain.EmpVO;
import com.yedam.web.employees.mapper.DeptMapper;
import com.yedam.web.employees.mapper.EmpMapper;

@Service
public class DepartmentServiceImpl implements DepartmentsService{

	@Autowired DeptMapper deptMapper;
	
	@Override
	public List<DepartmentsVO> getDeptList() {
		return deptMapper.getDeptList();
	}
	
}
