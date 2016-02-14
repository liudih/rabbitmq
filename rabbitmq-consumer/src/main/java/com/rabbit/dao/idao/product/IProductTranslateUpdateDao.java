package com.rabbit.dao.idao.product;

import java.util.List;

import com.rabbit.dao.idao.IProductUpdateDao;
import com.rabbit.dto.product.ProductTranslate;

public interface IProductTranslateUpdateDao extends IProductUpdateDao {

	int deleteByIid(Integer iid);

	int addProductTranslate(ProductTranslate record);

	int addSelectiveProductTranslate(ProductTranslate record);

	int alterSelectiveProductTranslate(ProductTranslate record);

	int alterProductTranslate(ProductTranslate record);

	int addProductTranslateList(List<ProductTranslate> list);

	int deleteByListingId(String listingId);

	int deleteByIdvalidListingId(Integer id, String listingId);

	int alterByListingIdAndLuanguage(ProductTranslate recorde);

}
