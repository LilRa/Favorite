package com.favorite;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.websocket.Session;

import org.apache.catalina.connector.Request;
import org.apache.tomcat.jni.Socket;
import org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.favorite.common.FileManager;
import com.favorite.model.FavoriteService;
import com.favorite.model.Img;
import com.favorite.model.Market;
import com.favorite.model.Place;



@Controller
public class FavoriteController {
	@Autowired
	private FavoriteService favoriteService;
	@Autowired
	private ServletContext context;
	@Autowired
	private FileManager fileManager;
	
	@RequestMapping("/AreaList.do")
	public ModelAndView areaSelectAll(){
		
		List list = favoriteService.areaSelectAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("AreaList");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/MarketList.do")
	public ModelAndView selectAll(int agree){
		System.out.println("agree = "+ agree);
		List list = favoriteService.selectAll(agree);
		System.out.println(list.size());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("MarketList");
		mav.addObject("list",list);
		return mav;
	}
	
	@RequestMapping("/MarketAdd.do")
	public ModelAndView Insert(Market market){
		
		System.out.println("넘어옴 " + market);
		List<Img> list = new ArrayList<Img>();
    	market.setAgree(1);
    	market.setArea_id(1);
    	market.setBusiness_id(1);
    	market.setMarket_title("복분자");
    	market.setPhone("121-1212-12121");
    	market.setGrade(2);
    	market.setUser_id(1);
    	
    	Place place = new Place();
    	place.setPlace_x("77.77777");
    	place.setPlace_y("888.8888");
    	
    	market.setPlace(place);
    	Img img = new Img();
  		
    	img.setImg_name("테스트이미지");
    	img.setImg_extension(".jpg");
    	list.add(img);
    	market.setImg(list); 	
    	System.out.println("넘어옴 " + market.getMarket_title());
    	
    	
		favoriteService.insert(market);
		
		return null;
	}

	
}
