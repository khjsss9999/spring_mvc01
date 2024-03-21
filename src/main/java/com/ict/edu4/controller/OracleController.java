package com.ict.edu4.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import com.ict.edu4.service.DAO;
import com.ict.edu4.service.VO;

@Controller
public class OracleController {
	//자바에서 지원하는게 @Inject이고 
	// @Inject
 @Autowired
	private DAO dao;
	@GetMapping("oracle_list.do")
	public ModelAndView oracleList() {
		ModelAndView mv = new ModelAndView("test04/list");
		List<VO> list =	dao.getList();
		mv.addObject("list", list);
		
		return mv;
	}
	
}
