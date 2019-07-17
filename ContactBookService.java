package com.recruit.service;

import java.util.Scanner;

import com.recruit.bean.EnquiryBean;
import com.recruit.dao.ContactBookDao;

public class ContactBookService {
	 Scanner sc=new Scanner(System.in);
	ContactBookDao cbd=new ContactBookDao();//creating an object for calling the dao class

	public void addEnquiry(EnquiryBean bean) {
		cbd.addEnquiry(bean);//passing the values to dao class
	}

	public long getEnquiryDetails(long enqryId) {
		return cbd.getEnquiryDetails(enqryId);//passing the values to dao class
	}
	
	
	public String validationFirstName(String fName)//validating the fName whether it is starts from capital or not
	{
		while(true)
			{
				if(fName.matches("[A-Z][a-zA-Z]*"))
				{
					return fName;
				}
				else
				{
					System.out.println("Enter valid first name : ");
					return fName=sc.next();
				}
		}		
	}
	
	public String validationLastName(String lName)//validating the lName whether it is starts from capital or not
	{
		if(lName.matches("[A-Z][a-zA-Z]*"))
		{
			return lName;
		}
		else
		{
			System.out.println("Enter valid last name : ");
			return lName=sc.next();
		}
	}
	
	public String validationPreferredLocation(String pLocation)//validating the pLocation whether it is starts from capital or not
	{
		if(pLocation.matches("[A-Z][a-zA-Z]*"))
		{
			return pLocation;
		}
		else
		{
			System.out.println("Enter valid preferred location : ");
			return pLocation=sc.next();
		}
	}
	
	public String validationPreferredDomain(String pDomain)//validating the pDomain whether it is starts from capital or not
	{
		if(pDomain.matches("[A-Z][a-zA-Z]*"))
		{
			return pDomain;
		}
		else
		{
			System.out.println("Enter valid preferred domain : ");
			return pDomain=sc.next();
		}
	}
	
	public long validationContactNo(long contactNo)//validating the contact number whether it is equal to 10 digits number or not
	{
		while(true)
		{
			if(String.valueOf(contactNo).length()==10)
			{
				return contactNo;
			}
			else
			{
				System.out.println("Enter the valid contact number: ");
				contactNo=sc.nextLong();
			}
		}
	}



}
