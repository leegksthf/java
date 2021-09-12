package com.yedam.web.employees.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private long employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private long salary;
	private long commission_pct;
	private long manager_id;
	private long department_id;
}
