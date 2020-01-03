package com.bboss.product.dao.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.entity.PcSkuEntity;


public interface PcOfferSkuBusinessDao {

	List<PcSkuEntity> findPcOfferSkuAssoc();
	List<PcSkuEntity> findPcSkuBusiness();
}
