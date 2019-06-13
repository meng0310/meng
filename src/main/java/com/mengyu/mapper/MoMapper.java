package com.mengyu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
//mapper接口
public interface MoMapper {
//查询列表
	List gettlist(@Param("name") String name,@Param("docter")  String docter, @Param("time") String time,  @Param("aaa")int aaa);
//删除
	boolean delete(@Param("ids") String ids);
	List xj(int id);
	int selectsid(int id);
	boolean xj0(int id);
	boolean xj1(int id);
	boolean xj2(int id);
	

}
