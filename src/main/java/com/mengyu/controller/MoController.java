package com.mengyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mengyu.service.MoService;
import com.mengyu.utils.Page;
//控制层
@Controller
public class MoController {
    @Autowired
    private MoService service;
    //查询列表
    @RequestMapping("gettlist.do")
    public String gettlist(Model model,@RequestParam(defaultValue="1") int pageNum,
    		@RequestParam(defaultValue="1") int aaa,
    		@RequestParam(defaultValue="1") int bbb,
    		@RequestParam(defaultValue="1") int ccc,
    		@RequestParam(defaultValue="") String name,
    		@RequestParam(defaultValue="") String docter,
//    		@RequestParam(defaultValue="") int minprice,
//    		@RequestParam(defaultValue="") int maxprice,
//    		@RequestParam(defaultValue="") int minyear,
//    		@RequestParam(defaultValue="") int maxyear,
//    		@RequestParam(defaultValue="") int mintimelong,
//    		@RequestParam(defaultValue="") int maxtimelong,
    		@RequestParam(defaultValue="") String time) {
    	System.out.println(aaa);
    	PageHelper.startPage(pageNum, 3);
    	List list=service.gettlist(name,docter,time,aaa);
    	String url="";
    	PageInfo info=new PageInfo(list);
    	Page.fenye(model, info, url);
    	model.addAttribute("list", list);
    	return "list";
    }
    //删除
    @RequestMapping("delete.do")
    @ResponseBody
    public boolean delete(String ids) {
    	boolean flag1=service.delete(ids);
    	return flag1;
    }
    
    //下架、
    @RequestMapping("xj.do")
    public boolean xj(int id) {
    	boolean flag2=service.xj(id);
    	System.out.println(flag2);
    	return flag2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
