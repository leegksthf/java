package com.yedam.app.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.board.domain.Criteria;
import com.yedam.app.board.domain.ReplyVO;

public interface ReplyMapper {
	//등록
	public int insert(ReplyVO vo);
	
	//수정
	public int update(ReplyVO vo);
	
	//삭제
	public int delete(ReplyVO vo);
	
	//단건조회
	public ReplyVO read(ReplyVO vo);
	
	//전체조회
	public List<ReplyVO> getList(@Param("cri") Criteria cri, @Param("bno") long bno);
	
	//해당 게시글의 댓글 수
	public int getCountByBno(Long bno);
}
