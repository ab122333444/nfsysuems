package com.nfsysu.ems.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ַ���������
 * @author 
 *
 */
public class StringUtil {

	/**
	 * �ж��Ƿ��ǿ�
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * �ж��Ƿ��ǿ�
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if((str!=null)&&!"".equals(str.trim())&&!"null".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * ��ʽ��ģ����ѯ
	 * @param str
	 * @return
	 */
	public static String formatLike(String str){
		if(isNotEmpty(str)){
			return "%"+str+"%";
		}else{
			return null;
		}
	}
	/**
	 * ��ȡ������Ϣ����
	 * @param str
	 * @param body
	 * @param param 0->���ģ� 1->���֣� 2->���ڣ� 3->ͷ��
	 * @return
	 */
	public static String patternGrxx(String str, String body ,int param){
		String matchStr = ""; 
		String key = str;
		key = "<span id=\"" + key + "\">";
		if(param == 0)// ����
			key += "([\u4e00-\u9fa5]+)";
		else if(param == 1)// ����
			key += "([\\d]+)";
		else if(param == 2)// ����
			key += "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))";
		key += "</span>";
		
		if(param == 3)// ͷ��
			key = "<img id=\"" + str + "\" " + "src=\"" + "(.*)" + "\" alt=\"��Ƭ\"";
		Pattern pattern = Pattern.compile(key);
		Matcher matcher = pattern.matcher(body);
		if (matcher.find()) {
            /*while (matcher.find()) {//�ҵ�ƥ����ַ���
                System.out.println("hit: " + matcher.group(0));
            }*/
            matchStr = matcher.group(1);
        } 
		return matchStr;
	}
}
