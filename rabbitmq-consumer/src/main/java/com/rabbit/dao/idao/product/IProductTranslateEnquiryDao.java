package com.rabbit.dao.idao.product;

import java.util.List;

import com.rabbit.dao.idao.IProductEnquiryDao;
import com.rabbit.dto.product.ProductTranslate;

public interface IProductTranslateEnquiryDao extends IProductEnquiryDao {

	ProductTranslate getProductTranslateByIid(Integer iid);

	List<ProductTranslate> getLanguageIdByListingid(String clisting);

	List<ProductTranslate> getProductTranslatesByListingid(String clisting);

	String getTitleByListingid(String clisting, Integer lan);

	List<ProductTranslate> getTitleByClistings(List<String> clistings);

	List<ProductTranslate> getTitleByClistingsAndLanguage(Integer languageId,
			List<String> clistings);
	
	ProductTranslate getTranslateByListingidAndLanguage(String listingid,Integer language);

	List<ProductTranslate> getProductTranslateByListingIdsAndLanuageId(
			List<String> listingids, int languageid);
	
	List<ProductTranslate> getProductTranslateBySku(String sku);
}
