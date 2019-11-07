package com.nuri.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin() {
		
	}
	
	@RequestMapping(value = "memberJoinResult", method = RequestMethod.POST)
	public ModelAndView memberJoinResult() {
		String msg = "Success";
		String path = "home";
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("common/common_result");
		
		
		return mv;
	}
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() {
		
	}
	
	@RequestMapping(value = "memberLoginResult")
	public void memberLoginResult() {
		
	}
	
	@RequestMapping(value = "memberMyPage")
	public void memberMyPage() {
		
	}
	
//	@RequestMapping(value = "memberMyPage")
//	public void memberMyPage() {
//		
//	}

}
