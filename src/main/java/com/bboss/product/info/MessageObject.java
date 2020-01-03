package com.bboss.product.info;

import java.io.Serializable;
import java.util.List;

import com.bboss.product.entity.CharacterEntity;

public class MessageObject<T> implements Serializable {

	private static final long serialVersionUID = 7514099767825174352L;
	private List<T> data;
	private Integer status;
	private String describe;
	public MessageObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageObject(List<T> data, Integer status, String describe) {
		super();
		this.data = data;
		this.status = status;
		this.describe = describe;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "MessageObject [data=" + data + ", status=" + status + ", describe=" + describe + "]";
	}
	
   
}
