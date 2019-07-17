package com.recruit.dao;

import com.recruit.bean.EnquiryBean;

public interface ContactBookDaoImpl {
	public void addDetails(EnquiryBean bean);
	public void addEnquiry(EnquiryBean bean);
	public long getEnquiryDetails(long enqryId);
	
}
