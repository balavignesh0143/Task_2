package com.recruit.ui;

import java.util.Random;
import java.util.Scanner;

import com.recruit.bean.EnquiryBean;
import com.recruit.dao.ContactBookException;
import com.recruit.service.ContactBookService;

public class Client {
	public static int getOption(Scanner sc)//exception for user input option whether it is integer or not
	{
		try
		{
			int option=sc.nextInt();
			return option;
		}
		catch(Throwable e)
		{
			System.out.println("String/Character values does not accept");
			return -1;
		}
	}
	public static void main(String[] args) {
		
		ContactBookService cbs=new ContactBookService();//calling service class for creating object name
		
		int option;//declaring variables
		String fName;//variable declarations
		String lName;
		long contactNo;
		String pDomain;
		String pLocation;
		
		
			do//looping the statements which continues before the condition if false
			{
				System.out.println("\n");
				System.out.println("*******************************Global Recruitments*******************************");
				System.out.println("Choose an operation");
				System.out.println("1.Enter Enquiry Details");
				System.out.println("2.View Enquiry Details on Id");
				System.out.println("3.Exit");
				System.out.println("*********************************************************************************");
				System.out.println("Please enter a choice :");
				Scanner sc=new Scanner(System.in);//enter by user needs
				option=getOption(sc);/*sc.nextInt();*///store the user input
				switch(option)
				{
				case 1:
					System.out.println("Enter First Name :");
					fName=cbs.validationFirstName(sc.next());
					System.out.println("Enter Last Name :");
					lName=cbs.validationLastName(sc.next());
					System.out.println("Enter Contact Number :");
					contactNo=cbs.validationContactNo(sc.nextLong());
					System.out.println("Enter Preferred Domain :");
					pDomain=cbs.validationPreferredDomain(sc.next());
					System.out.println("Enter Preferred Location :");
					pLocation=cbs.validationPreferredLocation(sc.next());
					Random r=new Random();//creating a random number using random method
					int no=r.nextInt(1500);//limit up to 1500
					long enqryId=no;
					EnquiryBean bean=new EnquiryBean(enqryId,fName,lName,contactNo,pLocation,pDomain);//passing the values to bean class for first time to stor the details
					cbs.addEnquiry(bean);//passing the bean class values to service class
					System.out.println("\n");
					System.out.println("Thank you "+fName+" "+lName+" your Unique Id is "+enqryId+" we will contact you shortly.");
					break;
				case 2:
					try
					{
						System.out.println("Enter the Enquiry No :");
						enqryId=sc.nextLong();
						no=(int) cbs.getEnquiryDetails(enqryId);//passing the value to service class and here type casting using for converting the long to int
					}
					catch(ContactBookException cbe)//user defined exception
					{
						System.out.println("Invalid enqryId...");
					}
					break;
				case 3:
					System.out.println("Thank you selecting us!!");
					System.exit(0);//exit the case
					break;
				default:
					System.out.println("Invalid option...");
					break;
				}
			}while(option!=3);//condition checking whether the given input is not equal to 3 or not
		
	}

}
