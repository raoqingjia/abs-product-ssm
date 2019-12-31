package com.bboss.product.entity;

import java.io.Serializable;

public class CharacterEntity implements Serializable{
	 
     /**
	 *  获取产品属性的实例
	 */
	private static final long serialVersionUID = -7478532653278836066L;
	private  String alias;
     private  String bizCharEnumSpecLst;
     private  String charDisplay;
     private  String charName;
     private  String charNum;
     private  String charType;
     private  String defaultFlag;
     private  String maxLength;
     private  String optionalFlag;
     private  String readonly;
     private  String regular;
     private  String skuNum;
     private  String skuName;
     private  String toBossFlag;
	public CharacterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharacterEntity(String alias, String bizCharEnumSpecLst, String charDisplay, String charName, String charNum,
			String charType, String defaultFlag, String maxLength, String optionalFlag, String readonly, String regular,
			String skuNum, String skuName, String toBossFlag) {
		super();
		this.alias = alias;
		this.bizCharEnumSpecLst = bizCharEnumSpecLst;
		this.charDisplay = charDisplay;
		this.charName = charName;
		this.charNum = charNum;
		this.charType = charType;
		this.defaultFlag = defaultFlag;
		this.maxLength = maxLength;
		this.optionalFlag = optionalFlag;
		this.readonly = readonly;
		this.regular = regular;
		this.skuNum = skuNum;
		this.skuName = skuName;
		this.toBossFlag = toBossFlag;
	}

	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getBizCharEnumSpecLst() {
		return bizCharEnumSpecLst;
	}
	public void setBizCharEnumSpecLst(String bizCharEnumSpecLst) {
		this.bizCharEnumSpecLst = bizCharEnumSpecLst;
	}
	public String getCharDisplay() {
		return charDisplay;
	}
	public void setCharDisplay(String charDisplay) {
		this.charDisplay = charDisplay;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getCharNum() {
		return charNum;
	}
	public void setCharNum(String charNum) {
		this.charNum = charNum;
	}
	public String getCharType() {
		return charType;
	}
	public void setCharType(String charType) {
		this.charType = charType;
	}
	public String getDefaultFlag() {
		return defaultFlag;
	}
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}
	public String getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}
	public String getOptionalFlag() {
		return optionalFlag;
	}
	public void setOptionalFlag(String optionalFlag) {
		this.optionalFlag = optionalFlag;
	}
	public String getReadonly() {
		return readonly;
	}
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}
	public String getRegular() {
		return regular;
	}
	public void setRegular(String regular) {
		this.regular = regular;
	}
	public String getSkuNum() {
		return skuNum;
	}
	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}
	public String getToBossFlag() {
		return toBossFlag;
	}
	public void setToBossFlag(String toBossFlag) {
		this.toBossFlag = toBossFlag;
	}
    
	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CharacterEntity [alias=" + alias + ", bizCharEnumSpecLst=" + bizCharEnumSpecLst + ", charDisplay="
				+ charDisplay + ", charName=" + charName + ", charNum=" + charNum + ", charType=" + charType
				+ ", defaultFlag=" + defaultFlag + ", maxLength=" + maxLength + ", optionalFlag=" + optionalFlag
				+ ", readonly=" + readonly + ", regular=" + regular + ", skuNum=" + skuNum + ", skuName=" + skuName
				+ ", toBossFlag=" + toBossFlag + "]";
	}

  
     
}
