package com.bboss.product.entity;

import java.io.Serializable;
import java.util.List;

public class PcSkuEntity<T> implements Serializable{

	private static final long serialVersionUID = 3107444663164186873L;
    
	private String  offerName;
	private String  offerNum;
	private String  skuNum;
	private String  skuName;
	private String  status;
	private String  action;
	private String  baseSku;
	private String  operationSubType;
	private String  operationSubName;
	private List<T> operationList;
	public PcSkuEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PcSkuEntity(String offerName, String offerNum, String skuNum, String skuName, String status, String action,
			String baseSku, String operationSubType, String operationSubName, List<T> operationList) {
		super();
		this.offerName = offerName;
		this.offerNum = offerNum;
		this.skuNum = skuNum;
		this.skuName = skuName;
		this.status = status;
		this.action = action;
		this.baseSku = baseSku;
		this.operationSubType = operationSubType;
		this.operationSubName = operationSubName;
		this.operationList = operationList;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferNum() {
		return offerNum;
	}
	public void setOfferNum(String offerNum) {
		this.offerNum = offerNum;
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
	public String getOperationSubType() {
		return operationSubType;
	}
	public void setOperationSubType(String operationSubType) {
		this.operationSubType = operationSubType;
	}
	public String getOperationSubName() {
		return operationSubName;
	}
	public void setOperationSubName(String operationSubName) {
		this.operationSubName = operationSubName;
	}
	public List<T> getOperationList() {
		return operationList;
	}
	public void setOperationList(List<T> operationList) {
		this.operationList = operationList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PcSkuEntity [offerName=" + offerName + ", offerNum=" + offerNum + ", skuNum=" + skuNum + ", skuName="
				+ skuName + ", status=" + status + ", action=" + action + ", baseSku=" + baseSku + ", operationSubType="
				+ operationSubType + ", operationSubName=" + operationSubName + ", operationList=" + operationList
				+ "]";
	}
	

    
}
