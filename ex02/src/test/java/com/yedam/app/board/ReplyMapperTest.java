package com.yedam.app.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.board.domain.Criteria;
import com.yedam.app.board.mapper.ReplyMapper;
import com.yedam.app.board.service.ReplyService;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)	//없으면 buildpath에서 library- junit4버전 넣어주기
@ContextConfiguration("classpath:/spring/*-context.xml")
public class ReplyMapperTest {

		@Autowired ReplyMapper replyMapper; //생성자 만들 필요 없으려고
		@Autowired ReplyService replyService;
		@Test
		public void getList() {
			Criteria cri = new Criteria(1,20);
			log.info(replyMapper.getList(cri, 377L).toString());
		}
		
		//@Test
		public void insert() {
			//BoardVO 생성
			
		//	boardMapper.insert(boardVO);
			
		}
	}
