package com.nuri.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class noticeService {
	
	@Inject
	private noticeDAO noticeDAO;
	
	
	public List<noticeDTO> noticeList() throws Exception {
		List<noticeDTO> ar = noticeDAO.noticeList();
		
		return ar;
	}
	
	public noticeDTO noticeSelect(int num) throws Exception{
		noticeDTO noticeDTO = new noticeDTO();
		noticeDTO = noticeDAO.noticeSelect(num);
		
		return noticeDTO;
	}
}
