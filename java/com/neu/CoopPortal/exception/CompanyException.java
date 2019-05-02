package com.neu.CoopPortal.exception;

public class CompanyException extends Exception {


		public CompanyException(String message)
		{
			super("CompanyException-"+message);
		}
		
		public CompanyException(String message, Throwable cause)
		{
			super("CompanyException-"+message,cause);
		}
		
	}


