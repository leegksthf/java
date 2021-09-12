package com.yedam.app.mapper;

import java.util.List;

import com.yedam.app.domain.LocationVO;

public interface LocationMapper {
	public List<LocationVO> getList();
	public LocationVO read(LocationVO vo);
	public int insert(LocationVO vo);
	public int delete(LocationVO vo);
	public int update(LocationVO vo);
	
}