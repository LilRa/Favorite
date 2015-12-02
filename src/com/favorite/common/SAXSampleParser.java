package com.favorite.common;




import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class SAXSampleParser extends DefaultHandler{
	
/*	boolean flag = false;
	StringBuffer result = new StringBuffer();
	Hrd hrd;
	ArrayList<Hrd> list; 
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		// 전체가 시작되는 부분을 만나면 리스트 생성
		if(qName.equalsIgnoreCase("srchList")){
			list = new ArrayList<Hrd>();
		// scn 시작 하면 dto생성
		}else if(qName.equalsIgnoreCase("scn_list")){
			hrd = new Hrd();	
		}else if(qName.equalsIgnoreCase("title")){
			flag = true;		
		}else if(qName.equalsIgnoreCase("titleIcon")){
			flag = true;
		}else if(qName.equalsIgnoreCase("imgGubun")){
			flag = true;
		}else if(qName.equalsIgnoreCase("subTitle")){
			flag = true;
		}else if(qName.equalsIgnoreCase("trainTarget")){
			flag = true;
		}else if(qName.equalsIgnoreCase("yardMan")){
			flag = true;
		}else if(qName.equalsIgnoreCase("regCourseMan")){
			flag = true;
		}else if(qName.equalsIgnoreCase("traEndDate")){
			flag = true;
		}else if(qName.equalsIgnoreCase("traStartDate")){
			flag = true;
		}else if(qName.equalsIgnoreCase("trprId")){
			flag = true;
		}else if(qName.equalsIgnoreCase("trprDegr")){
			flag = true;
		}

	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		if(flag){
			String tmpString = new String(ch,start,length);
			result.append(tmpString);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		if(qName.equalsIgnoreCase("title")){
			flag = false;
			hrd.setTitle(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("titleIcon")){
			flag = false;
			hrd.setTitle_icon(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("imgGubun")){
			flag = false;
			hrd.setImg_gubun(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("subTitle")){
			flag = false;
			hrd.setSub_title(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("trainTarget")){
			flag = false;
			hrd.setTrain_target(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("yardMan")){
			flag = false;
			hrd.setYard_man(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("regCourseMan")){
			flag = false;
			hrd.setReg_course_man(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("traEndDate")){
			flag = false;
			setDate(result.toString(),false);
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("traStartDate")){
			flag = false;
			setDate(result.toString(),true);
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("trprId")){
			flag = false;
			hrd.setTrpr_id(result.toString());
			result.delete(0, result.length());
		}else if(qName.equalsIgnoreCase("trprDegr")){
			flag = false;
			hrd.setTrpr_degr(result.toString());
			result.delete(0, result.length());
		// 리스트에 추가
		}else if(qName.equalsIgnoreCase("scn_list")){
			flag = false;	
			list.add(hrd);
		}
		
	}
	
	public void setDate(String date, boolean dataFlag){
		String year = "";
		String month = "";
		String day = "";
		String tmpDate = date;
		year = tmpDate.split("-")[0];
		month = tmpDate.split("-")[1];
		day = tmpDate.split("-")[2];
		// 참일때 시작 날짜
		if(dataFlag){
			hrd.setStart_year(year);	
			hrd.setStart_month(month);
			hrd.setStart_day(day);
		// 거짓일때 끝나는 날짜
		}else{
			hrd.setEnd_year(year);
			hrd.setEnd_month(month);
			hrd.setEnd_day(day);
		}
		
		
		
	}*/

}
