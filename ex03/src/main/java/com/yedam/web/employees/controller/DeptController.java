package com.yedam.web.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.web.employees.domain.DepartmentsVO;
import com.yedam.web.employees.service.DepartmentsService;

@Controller
public class DeptController {

	@Autowired DepartmentsService departmentsService;
	//부서관리 페이지
	@GetMapping("/dept")						//주소창
	public String dept() {
		return "insa/dept";						//보여줄 파일
	}
	
	//ajax : 목록, 등록, 수정, 삭제 구현 responsebody . 데이터 넘겨주기. empcontroller와 내용은 같음.
	@GetMapping("/deptList")
	@ResponseBody
	public List<DepartmentsVO> deptList(){
		return departmentsService.getDeptList();
	}
}
