package com.rabbit.utils;

import java.util.regex.Matcher;   
import java.util.regex.Pattern;   
  
/**  
 * <p>  
 * Title: HTML相关的正则表达式工具类  
 * </p>  
 * <p>  
 * Description: 包括过滤HTML标记，转换HTML标记，替换特定HTML标记  
 * </p>  
 * <p>  
 * Copyright: Copyright (c) 2006  
 * </p>  
 *   
 * @author hejian  
 * @version 1.0  
 * @createtime 2006-10-16  
 */  
  
public  class HtmlRegexpUtil {   
	private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式  
    private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式  
    private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式 
    private static final String regEx_space = "\\t|\r|\n";//定义空格回车换行符 




public static String delHTMLTag(String htmlStr) {  
        Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);  
        Matcher m_script = p_script.matcher(htmlStr);  
        htmlStr = m_script.replaceAll(""); // 过滤script标签  
  
        Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);  
        Matcher m_style = p_style.matcher(htmlStr);  
        htmlStr = m_style.replaceAll(""); // 过滤style标签  
  
        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);  
        Matcher m_html = p_html.matcher(htmlStr);  
        htmlStr = m_html.replaceAll(""); // 过滤html标签  
  
        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);  
        Matcher m_space = p_space.matcher(htmlStr);  
        htmlStr = m_space.replaceAll(""); // 过滤空格回车标签  
        return htmlStr.trim(); // 返回文本字符串  
    }  
      
    public static String getTextFromHtml(String htmlStr){  
        htmlStr = delHTMLTag(htmlStr);  
        htmlStr = htmlStr.replaceAll("&nbsp;", "");  
        return htmlStr;  
    }  
}