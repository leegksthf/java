package com.yedam.app.service;

import java.util.List;

import com.yedam.app.domain.LocationVO;

public interface LocationService {
	public List<LocationVO> getList();
	public LocationVO read(LocationVO vo);
	public int insert(LocationVO vo);
	public int delete(LocationVO vo);
	public int update(LocationVO vo);
}
