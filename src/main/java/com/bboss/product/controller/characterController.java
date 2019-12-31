package com.bboss.product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.info.MessageObject;
import com.bboss.product.service.interfaces.CharacterService;

@Component
@RequestMapping("/character")
public class characterController {
	@Autowired
	private CharacterService characterService;
    
	/**
	 * 
	 * @param charName
	 * @param charNum
	 * @return  MessageObject 
	 *   可以通过charName和 charNum 查询产品属性的列表
	 */
	@RequestMapping("/findCharacter")
	@ResponseBody
	public MessageObject findCharacter(String charName,String charNum,String skuName,String skuNum) {
		
		List<CharacterEntity> result = characterService.findCharacter(charName,charNum,skuName,skuNum);
		if(result==null){
			throw new RuntimeException("查询产品属性报错");
		}
		MessageObject msg =new MessageObject();
		msg.setStatus(200);
		if(result.size()==0){
			msg.setDescribe("查不到对应信息！");
		}
		msg.setData(result);
		msg.setDescribe("查询数据成功!");
		return msg;
	}

}
