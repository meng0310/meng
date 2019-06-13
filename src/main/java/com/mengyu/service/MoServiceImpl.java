package com.mengyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mengyu.mapper.MoMapper;
//服务层
@Service
public class MoServiceImpl implements MoService {
    @Autowired
    private MoMapper mapper;

   //删除
	public boolean delete(String ids) {
		// TODO Auto-generated method stub
		return mapper.delete(ids);
	}
//查询列表
	public List gettlist(String name, String docter,String time,int aaa) {
		// TODO Auto-generated method stub
		return mapper.gettlist(name,docter,time,aaa);
	}
	public boolean xj(int id) {
		// TODO Auto-generated method stub
		
			int sid=mapper.selectsid(id);
			if(sid==0) {
				boolean flag2=mapper.xj0(id);
				System.out.println(flag2);
			}
			if(sid==1) {
				boolean flag2=mapper.xj1(id);
				System.out.println(flag2);
			}
			if(sid==2) {
				boolean flag2=mapper.xj2(id);
				System.out.println(flag2);
			}
			return false;
	}
}
