package com.bboss.product.entity;

import java.io.Serializable;

public class PcSkuEntity implements Serializable{

	private static final long serialVersionUID = 3107444663164186873L;
    
	private String  skuNum;
	private String  skuName;
	private String  status;
	private String  action;
	private String  baseSku;
	public PcSkuEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PcSkuEntity(String skuNum, String skuName, String status, String action, String baseSku) {
		super();
		this.skuNum = skuNum;
		this.skuName = skuName;
		this.status = status;
		this.action = action;
		this.baseSku = baseSku;
	}
	public String getSkuNum() {
		return skuNum;
	}
	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getBaseSku() {
		return baseSku;
	}
	public void setBaseSku(String baseSku) {
		this.baseSku = baseSku;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PcSkuEntity [skuNum=" + skuNum + ", skuName=" + skuName + ", status=" + status + ", action=" + action
				+ ", baseSku=" + baseSku + "]";
	}
	
}
