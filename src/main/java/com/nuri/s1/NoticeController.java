package com.nuri.s1;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nuri.s1.notice.noticeDTO;
import com.nuri.s1.notice.noticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Inject
	private noticeService noticeService;
	

	
	// Write POST
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public String noticeWrite(noticeDTO noticeDTO) {
		return "redirect:./noticeList";
		
	}
	
	// Write GET
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public String noticeWrite() {
		
		return "notice/noticeWrite";
	}
	
	
	//selectOne
	@RequestMapping(value =  "noticeSelect")
	public ModelAndView noticeSelect(int num) throws Exception {
		noticeDTO noticeDTO = noticeService.noticeSelect(num);
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		return mv;
	}
	
	// list
	@RequestMapping("noticeList")
	public ModelAndView noticeList()throws Exception {
		List<noticeDTO> ar = noticeService.noticeList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
		
	}
	
	

}
