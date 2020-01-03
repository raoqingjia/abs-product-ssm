package com.bboss.product.exception;

import java.util.ArrayList;

import com.bboss.product.info.MessageObject;

public class ServiceException  extends RuntimeException{

	/**
	 *   ServiceException  业务层抛出异常
	 */
	private static final long serialVersionUID = -6533995487069067672L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	

   
	

}
