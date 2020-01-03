package com.bboss.product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bboss.product.entity.PcOfferEntity;
import com.bboss.product.info.MessageObject;
import com.bboss.product.service.interfaces.PcOfferService;

@Component
@RequestMapping("/offer")
public class PcOfferController {
	
	@Autowired
	public PcOfferService  pcOfferService;
	
	@RequestMapping("/findPcOffer")
	@ResponseBody
	public  MessageObject<PcOfferEntity> findPcOffer() {
	  List<PcOfferEntity> pcOfferList=pcOfferService.findPcOffer();
	  MessageObject<PcOfferEntity> msg =new MessageObject<PcOfferEntity>(pcOfferList, 200, "数据传输成功");
	  return msg;
	}
	
	@RequestMapping("/findPcOfferSkuOpreationLinkage")
	@ResponseBody
	public  MessageObject<PcOfferEntity> findPcOfferSkuOpreationLinkage() {
	  List<PcOfferEntity> pcOfferList=pcOfferService.findPcOfferSkuOpreationLinkage();
	  MessageObject<PcOfferEntity> msg =new MessageObject<PcOfferEntity>(pcOfferList, 200, "数据传输成功");
	  return msg;
	}
	
}
