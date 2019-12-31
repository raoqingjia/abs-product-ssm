package com.bboss.product.service.interfaces;

import java.util.List;
import java.util.Map;

import com.bboss.product.entity.CharacterEntity;

public interface CharacterService {
	List<CharacterEntity> findCharacter(String charName,String charNum,String skuName, String skuNum);
	
}
