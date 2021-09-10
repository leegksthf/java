package com.yedam.web.employees.domain;

import lombok.Data;

@Data
public class Criteria {
	private int pageNum = 1;
	private int amount = 10;
	private String keyword;
	private String type;
	
	public Criteria() {}
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
