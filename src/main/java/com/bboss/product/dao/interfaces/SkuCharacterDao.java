package com.bboss.product.dao.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bboss.product.entity.CharacterEntity;


public interface SkuCharacterDao {

	List<CharacterEntity> findCharacter(@Param(value = "charName") String charName,
			@Param(value = "charNum") String charNum,
			@Param(value = "skuNum") String skuNum);
}
