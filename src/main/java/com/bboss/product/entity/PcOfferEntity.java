package com.bboss.product.entity;

import java.io.Serializable;
import java.util.List;

public class PcOfferEntity<T> implements Serializable {
	/**
	 *   pc_offer 的实体类
	 */
	private static final long serialVersionUID = -1042877570375629834L;
    private String offerName;
    private String offerNum;
    private String offerType;
    private String status;
    private String action;
    private List<T> skuList;
	public PcOfferEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	
	public PcOfferEntity(String offerName, String offerNum, String offerType, String status, String action,
			List<T> skuList) {
		super();
		this.offerName = offerName;
		this.offerNum = offerNum;
		this.offerType = offerType;
		this.status = status;
		this.action = action;
		this.skuList = skuList;
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
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<T> getSkuList() {
		return skuList;
	}
	public void setSkuList(List<T> skuList) {
		this.skuList = skuList;
	}
	@Override
	public String toString() {
		return "PcOfferEntity [offerName=" + offerName + ", offerNum=" + offerNum + ", offerType=" + offerType
				+ ", status=" + status + ", action=" + action + "]";
	}
    
	
}
