package com.nuri.s1.notice;

import java.util.List;

public class noticeService {
	private noticeDAO noticeDAO;
	
	public noticeService() {
		this.noticeDAO=noticeDAO;
	}
	
	public List<noticeDTO> noticeList() throws Exception {
		List<noticeDTO> ar = noticeDAO.noticeList();
		
		return ar;
	}
	
	public void setNoticeDAO(noticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	public noticeDTO noticeSelect(int num) throws Exception{
		noticeDTO noticeDTO = new noticeDTO();
		noticeDTO = noticeDAO.noticeSelect(num);
		
		return noticeDTO;
	}
}
