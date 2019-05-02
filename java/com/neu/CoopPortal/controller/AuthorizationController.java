package com.neu.CoopPortal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neu.CoopPortal.pojo.JobList;
import com.neu.CoopPortal.pojo.User;

@Controller
@RequestMapping("/authorize/*")
public class AuthorizationController {

	
	@RequestMapping(value = "/authorize/error.htm", method = RequestMethod.GET)
	protected ModelAndView addjobs(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("errorpage");

		return mv;
	}
	
	@RequestMapping(value = "/authorize/JobUpdateError.htm", method = RequestMethod.GET)
	protected ModelAndView errorjobs(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("error-jobupdate");

		return mv;
	}
}
