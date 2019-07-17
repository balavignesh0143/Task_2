package com.recruit.dao;

import java.util.HashMap;

import com.recruit.bean.EnquiryBean;

public class ContactBookDao {

	HashMap<Long,EnquiryBean> hm=new HashMap<Long,EnquiryBean>();//creating a HashMap for store the values given by user
	EnquiryBean bean;
	
	public void addDetails(EnquiryBean bean)
	{
		this.bean=bean;
		hm.put(bean.getEnqryId(),bean);
		System.out.println(hm);
	}
	
	public HashMap<Long,EnquiryBean> hm()//return the HashMap values
	{
		return hm;
	}

	public void addEnquiry(EnquiryBean bean) {//add the details whom enquires the recruitments in this organization
		hm.put(bean.getEnqryId(),bean);//get the enqryid from the bean class
		bean=(EnquiryBean)hm.get(bean.getEnqryId());//store the values ito the bean class
	}

	public long getEnquiryDetails(long enqryId) {//retrieve the enquiry details from the hashmap
		bean=(EnquiryBean)hm.get(enqryId);
		if(bean==null)//checking whether the given enqryid is null or not 
		{
			throw new ContactBookException("Invalid enqryId...");
		}
		else
		{
			System.out.println("\n");
			System.out.println("Id : "+bean.getEnqryId());
			System.out.println("First Name : "+bean.getfName());
			System.out.println("Last Name : "+bean.getlName());
			System.out.println("Contact No : "+bean.getContactNo());
			System.out.println("Preferred Domain : "+bean.getpDomain());
			System.out.println("Preferred Location : "+bean.getpLocation());
		}
		return enqryId;
		
	}
}
