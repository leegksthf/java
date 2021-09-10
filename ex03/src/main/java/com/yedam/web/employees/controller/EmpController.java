package com.yedam.web.employees.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.web.employees.domain.EmpVO;
import com.yedam.web.employees.service.DepartmentsService;
import com.yedam.web.employees.service.EmpService;
import com.yedam.web.employees.service.JobsService;

@Controller
@RequestMapping("/insa/*")
public class EmpController {

	@Autowired
	EmpService empService;
	@Autowired
	JobsService jobsService;
	@Autowired
	DepartmentsService departmentsService;

	@ModelAttribute("opt")
	public Map<String, Object> jobs() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jobs", jobsService.getJobsList());
		map.put("depts", departmentsService.getDeptList());
		return map;
	}

	// 전체조회
	@GetMapping("/list")
	public void employeesList(Model model) {
		model.addAttribute("list", empService.getList());
	}

	// 등록폼
	@GetMapping("/insertEmp")
	public String insertFormEmp(EmpVO vo) {
		return "insa/insertEmp";
	}

	// 목록조회
	@RequestMapping("/empList")
	public String empList(Model model, EmpVO empVO) {
		model.addAttribute("empList", empService.getList());
		return "insa/list";
	}
	
	// 단건조회
	
	//사원검색
	@RequestMapping("/empSearch")
	public String empSearch(Model model, EmpVO vo) {
		model.addAttribute("empList", empService.getList());
		return "insa/empSearch";
	}

	@RequestMapping("ajaxEmp")
	@ResponseBody
	public EmpVO ajaxEmp(EmpVO vo) {
		return empService.emp(vo);
	}

	@RequestMapping("ajaxEmail")
	@ResponseBody
	public EmpVO ajaxEmail(EmpVO vo) {
		return empService.emp(vo);
	}
	
	// 수정폼
	@GetMapping("updateEmp")
	public String inserFormEmp(EmpVO vo, Model model) {
		 model.addAttribute("emp", empService.emp(vo));
		 return "insa/insertEmp";
	 }
}
