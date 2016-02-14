package com.rabbit.dto.search;


/**
 * 产品类型
 * @author ztiny
 * @Date 2015-12-19
 */
public class ProductTypeEntity {
	
	//国际化语言ID
	private int languageId;
	//产品类目ID
	private int productTypeId;
	//产品类目名称
	private String productTypeName;
	//类目层级
	private int level;
	//类目路径
	private String cpath;
	//排序
	private int sort = 999;
	
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getCpath() {
		return cpath;
	}
	public void setCpath(String cpath) {
		this.cpath = cpath;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public int getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	 
	
}
