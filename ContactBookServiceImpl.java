package com.recruit.service;

import com.recruit.bean.EnquiryBean;

public interface ContactBookServiceImpl {
	public void addEnquiry(EnquiryBean bean);
	public long getEnquiryDetails(long enqryId);
	public String validationFirstName(String fName);
	public String validationLastName(String lName);
	public String validationPreferredLocation(String pLocation);
	public String validationPreferredDomain(String pDomain);
	public long validationContactNo(long contactNo);
}
