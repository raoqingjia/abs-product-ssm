package com.bboss.product.service.interfaces;

import java.util.List;

import com.bboss.product.entity.PcOfferEntity;

public interface PcOfferService {
	public List<PcOfferEntity> findPcOffer();
	public List<PcOfferEntity> findPcOfferSkuOpreationLinkage();
}
