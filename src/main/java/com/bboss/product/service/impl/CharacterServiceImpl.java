package com.bboss.product.service.impl;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bboss.product.dao.interfaces.PcOfferDao;
import com.bboss.product.dao.interfaces.PcSkuDao;
import com.bboss.product.dao.interfaces.SkuCharacterDao;
import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.entity.PcOfferEntity;
import com.bboss.product.entity.PcSkuEntity;
import com.bboss.product.exception.ServiceException;
import com.bboss.product.service.interfaces.CharacterService;

@Service
public class CharacterServiceImpl implements CharacterService {
	
	@Autowired
	public SkuCharacterDao skuCharacterDao;
	@Autowired
	public PcSkuDao pcSkuDao;

	public List<CharacterEntity> findCharacter(String charName, String charNum,String skuName, String skuNum) {
		
		List<PcSkuEntity> pcSkuList=new ArrayList<PcSkuEntity>();
		List<CharacterEntity> resultList = new ArrayList<CharacterEntity>();
		if("".equals(skuName)) {
			pcSkuList = pcSkuDao.findPcSku(skuName, skuNum);
			resultList = skuCharacterDao.findCharacter(charName, charNum,skuNum);
			for (int a = 0; a < resultList.size(); a++) {
				CharacterEntity charEntity = resultList.get(a);
				for (int b = 0; b < pcSkuList.size(); b++) {
					PcSkuEntity pcSkuEntity = pcSkuList.get(b);
					if (charEntity.getSkuNum().equals(pcSkuEntity.getSkuNum())) {
						charEntity.setSkuName(pcSkuEntity.getSkuName());
					}
				}
			}
		}else{
		   pcSkuList = pcSkuDao.findPcSku(skuName, skuNum);
		   
		   List<CharacterEntity> characterList=skuCharacterDao.findCharacter(charName, charNum,skuNum);
			for(int a=0;a<pcSkuList.size();a++) {
				PcSkuEntity pcSku=pcSkuList.get(a);
				for(int b=0;b<characterList.size();b++) {
					CharacterEntity character=characterList.get(b);
					if(pcSku.getSkuNum().equals(character.getSkuNum())) {
						character.setSkuName(pcSku.getSkuName());
						resultList.add(character);
					}
				}
				
			}
			
		}
		return resultList;
	}
 
	
	public List<CharacterEntity> findCharacterByOpreation(String charName, String charNum, String skuName,
			String skuNum) {
		
		return new ArrayList<CharacterEntity>();
	}
}
