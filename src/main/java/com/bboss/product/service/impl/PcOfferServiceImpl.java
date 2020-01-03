package com.bboss.product.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bboss.product.dao.interfaces.PcOfferDao;
import com.bboss.product.dao.interfaces.PcOfferSkuBusinessDao;
import com.bboss.product.dao.interfaces.PcSkuDao;
import com.bboss.product.entity.PcOfferEntity;
import com.bboss.product.entity.PcSkuEntity;
import com.bboss.product.service.interfaces.PcOfferService;

@Service
public class PcOfferServiceImpl implements PcOfferService {
	@Autowired
	public PcSkuDao  pcSkuDao; 
	@Autowired
	public PcOfferSkuBusinessDao pcOfferSkuBusinessDao;
	@Autowired
	public PcOfferDao pcOfferDao;

	public List<PcOfferEntity> findPcOffer() {
		List<PcOfferEntity> pcOfferList=pcOfferDao.findPcOffer();
		System.out.println(pcOfferList);
		return pcOfferList;
	}
	public List<PcOfferEntity> findPcOfferSkuOpreationLinkage() {
		List<PcOfferEntity> pcOfferList=pcOfferDao.findPcOffer();
		List<PcSkuEntity>  pcOfferSkuAssocList=pcOfferSkuBusinessDao.findPcOfferSkuAssoc();
		List<PcSkuEntity>  pcSkuBussList=pcOfferSkuBusinessDao.findPcSkuBusiness();
		System.out.print(pcSkuBussList.get(0));
		for(PcSkuEntity skuItem : pcOfferSkuAssocList) {
			List<Map<String,Object>> operationList=new ArrayList<Map<String,Object>>();
			for(PcSkuEntity bussItem : pcSkuBussList) {
				 if(skuItem.getSkuNum().equals(bussItem.getSkuNum())) {
					 Map<String,Object> map =new HashMap<String, Object>();
					 map.put("operationType", bussItem.getOperationSubType());
					 map.put("operationName", bussItem.getOperationSubName());
					 operationList.add(map);
				 }
			}
			skuItem.setOperationList(operationList);
		}
		
		
		/*商品上拼接产品*/
		for(PcOfferEntity offerItem : pcOfferList) {
			List<PcSkuEntity> skuList=new ArrayList<PcSkuEntity>();
			for(PcSkuEntity assocItem :pcOfferSkuAssocList) {
				if(offerItem.getOfferNum().equals(assocItem.getOfferNum())) {
					assocItem.setOfferName(offerItem.getOfferName());
					skuList.add(assocItem);
				}
			}
			offerItem.setSkuList(skuList);
		}
		return pcOfferList;
	}
}
