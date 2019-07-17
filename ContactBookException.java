package com.recruit.dao;

@SuppressWarnings("serial")
public class ContactBookException extends RuntimeException{//checking the exceptions by user this is user defined exception

	public ContactBookException(String msg)
	{
		super(msg);
	}
	public ContactBookException(String msg,Throwable ex)
	{
		super(msg,ex);
	}
}