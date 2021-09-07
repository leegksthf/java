package com.yedam.app.board;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.board.domain.BoardVO;
import com.yedam.app.board.domain.Criteria;
import com.yedam.app.board.mapper.ReplyMapper;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)	//없으면 buildpath에서 library- junit4버전 넣어주기
@ContextConfiguration("classpath:/spring/*-context.xml")
public class ReplyMapperClient {

	@Autowired ReplyMapper replymapper; //생성자 만들 필요 없으려고
	
	@Test
	public void getList() {
		
	}
	
	//@Test
	public void insert() {

	}
	
	//@Test
	public void read() {

	}
	
	//@Test
	public void update() {

	}
	
	//@Test
	public void delete() {

	}
	
}
