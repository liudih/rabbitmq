package com.rabbit.dao.idao.product;

import java.util.List;

import com.rabbit.dto.transfer.Attribute;

public interface IAttributeEnquiryDao {

	/**
	 * 获取keyid
	 * 
	 * @param keyName
	 * @param lang
	 * @return
	 */
	Integer getKeyId(String keyName, Integer lang);

	/**
	 * 获取所有属性
	 * 
	 * @param languageid
	 * @return
	 */
	List<Attribute> getAll(Integer languageid);
}
