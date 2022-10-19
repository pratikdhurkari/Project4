package com.rays.pro4.Exception;

/**
 * ApplicationException is propagated from Service classes when an business
 * logic exception occurred.
 * 
 * @author Pratik Dhurkari
 *
 */

public class ApplicationException extends Exception{

	public ApplicationException(String msg){
		super(msg);
	}
	
}
