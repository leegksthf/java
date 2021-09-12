package com.yedam.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.domain.LocationVO;
import com.yedam.app.mapper.LocationMapper;
import com.yedam.app.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	LocationMapper mapper;
	
	@Override
	public List<LocationVO> getList() {
		return mapper.getList();
	}

	@Override
	public LocationVO read(LocationVO vo) {
		// TODO Auto-generated method stub
		return mapper.read(vo);
	}

	@Override
	public int insert(LocationVO vo) {
		// TODO Auto-generated method stub
		return mapper.insert(vo);
	}

	@Override
	public int delete(LocationVO vo) {
		// TODO Auto-generated method stub
		return mapper.delete(vo);
	}

	@Override
	public int update(LocationVO vo) {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

}
