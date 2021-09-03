package com.yedam.app.board;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.board.domain.BoardVO;
import com.yedam.app.board.service.BoardService;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)	//없으면 buildpath에서 library- junit4버전 넣어주기
@ContextConfiguration("classpath:/spring/*-context.xml")
public class BoardMapperClient {

	@Autowired BoardService boardMapper; //생성자 만들 필요 없으려고
	
	@Test
	public void getList() {
		log.info(boardMapper.getList().toString());
	}
	
	@Test
	public void insert() {
		//BoardVO 생성
		BoardVO vo = new BoardVO();
		vo.setContent("헤헤우오");
		vo.setTitle("고릴라");
		vo.setWriter("훌라");
		boardMapper.insert(vo);
		log.info(Long.toString(vo.getBno()));
	}
	
	@Test
	public void read() {
		BoardVO vo = new BoardVO();
		vo.setBno(1);
		vo = boardMapper.read(vo);
		log.info(vo.toString());
	}
	
	@Test
	public void update() {
		BoardVO vo = new BoardVO();
		//vo.setBno(1);
		vo.setContent("aa");
		vo.setTitle("title");
		vo.setWriter("홍길동");
		boardMapper.update(vo);
		//int result = boardMapper.update(vo);	int로 바꿨을 떄 일케	
		//assertEquals(result,1);
	}
	
	@Test
	//@Rollback
	public void delete() {
		BoardVO vo = new BoardVO();
		vo.setBno(9);
		boardMapper.delete(vo);
		//int result = boardMapper.delete(vo);	
		//assertEquals(result,1);
	}
	
}
