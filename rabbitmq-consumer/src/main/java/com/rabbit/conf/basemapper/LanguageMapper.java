package com.rabbit.conf.basemapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rabbit.dto.base.LanguageLocal;
import com.rabbit.dto.base.SimpleLanguage;

public interface LanguageMapper {

	@Select("select * from t_language where iid = #{0} limit 1")
	LanguageLocal selectByPrimaryKey(Integer iid);

	@Select("select * from t_language WHERE bfallback = true limit 1")
	LanguageLocal selectDefaultLanguage();

	@Select("select iid, cname from t_language order by iid")
	List<SimpleLanguage> getAllSimpleLanguages();

	/**
	 * 查询出所有语言
	 * 
	 * @return List<Language>
	 */
	@Select("select * from t_language")
	List<LanguageLocal> getAllLanguage();

	@Select("select max(iid) from t_language")
	int getLanguageMaxId();

	@Select("select * from t_language where iid>#{0} order by iid asc")
	List<LanguageLocal> getMaxLanguage(int mid);

	/**
	 * 
	 * @Title: getLanguages
	 * @Description: TODO(查询语言（分页）)
	 * @param @param pageIndex
	 * @param @param limit
	 * @param @return
	 * @return List<Language>
	 * @throws
	 * @author yinfei
	 */
	@Select("select * from t_language limit #{1} offset #{0}")
	List<LanguageLocal> getLanguages(int pageIndex, int limit);

	/**
	 * 
	 * @Title: getLanguageCount
	 * @Description: TODO(查询所有语言的个数)
	 * @param @return
	 * @return int
	 * @throws
	 * @author yinfei
	 */
	@Select("select count(*) from t_language")
	int getLanguageCount();

	/**
	 * 
	 * @Title: getLanguagesByIds
	 * @Description: TODO(通过语言ID列表查询语言列表)
	 * @param @param languageIds
	 * @param @return
	 * @return List<Language>
	 * @throws
	 * @author yinfei
	 */
	@Select("<script>"
			+ "select * from t_language "
			+ "where iid in "
			+ "<foreach item='item' index='index' collection='list' open='(' separator=',' close=')'>#{item}</foreach>"
			+ "</script>")
	List<LanguageLocal> getLanguagesByIds(@Param("list") List<Integer> languageIds);

	/**
	 * 
	 * @Title: getLanguageCount
	 * @Description: TODO(查询所有语言的个数)
	 * @param @return
	 * @return int
	 * @throws
	 * @author yinfei
	 */
	@Select("select * from t_language where cname=#{0} limit 1")
	LanguageLocal getLanguageByCode(String langCode);

}