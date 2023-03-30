package com.kk.visa.impl;

import com.kk.visa.mapper.MainMapper;
import com.kk.visa.model.MainModel;
import com.kk.visa.service.MainService;

import jakarta.annotation.Resource;

public class MainImpl implements MainService {
	
	@Resource
	private MainMapper mainMapper;

	@Override
	public Object insert(MainModel mainModel) {
		return mainMapper.insert(mainModel);
	}
	

}
