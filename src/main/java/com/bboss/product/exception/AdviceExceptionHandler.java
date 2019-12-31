package com.bboss.product.exception;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bboss.product.info.MessageObject;

@ControllerAdvice
public class AdviceExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
    public MessageObject<List> AdviceRuntimeException(RuntimeException e){
		MessageObject<List> msg=new MessageObject();
		msg.setData(null);
		msg.setStatus(500);
		msg.setDescribe(e.getMessage());
		return msg;	
    }
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
    public MessageObject<Object> AdviceServiceException(ServiceException e){
		MessageObject<Object> msg = new MessageObject(new ArrayList<Object>(), 401, e.getMessage());
		return msg;	
    }
	
	@ExceptionHandler(ConnectException.class)
	@ResponseBody
    public MessageObject<List> AdviceConnectException(ConnectException e){
		MessageObject<List> msg=new MessageObject();
		msg.setData(null);
		msg.setStatus(500);
		msg.setDescribe(e.getMessage());
		return msg;	
    }
}
