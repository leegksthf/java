package com.yedam.web.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.web.employees.domain.JobsVO;
import com.yedam.web.employees.mapper.JobsMapper;

@Service
public class JobsServiceImpl implements JobsService{
	@Autowired JobsMapper jobsMapper;

	@Override
	public List<JobsVO> getJobsList() {
		return jobsMapper.getJobsList();
	}

}
