package com.mengyu.service;

import java.util.List;

public interface MoService {
//查询列表
	List gettlist(String name, String docter,String time,int aaa);
//删除
	boolean delete(String ids);
	boolean xj(int id);

}
