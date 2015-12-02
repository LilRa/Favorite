package com.favorite.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.favorite.model.FavoriteDAO;
import com.favorite.model.Img;
import com.favorite.model.Market;
import com.favorite.model.Place;
@Repository
public class FavoriteDAOImlp extends SqlSessionDaoSupport implements FavoriteDAO {

	// 가계정보 리스트 출력
	@Override
	public List selectAll(int agree) {
		// TODO Auto-generated method stub
		 List list= getSqlSession().selectList("Market.selectAll",agree);
		return list;
	}
	
	// 가계 정보 입력
	@Override
	public void insert(Market market) {
		// TODO Auto-generated method stub
		// 위치 정보 추출
		Place place = market.getPlace();
		// 이미지 정보 추출
		List<Img> imgList = market.getImg();
		// 위치 정보 DB에 추가
		getSqlSession().insert("Place.insert", place);
		// 추가한 위치 정보 id 가져옴
		 market.setPlace_id(place.getPlace_id());
		 // 가계정보 추가
		 getSqlSession().insert("Market.insert", market);
		 // 가계 id 이미지 정보에 추가
		 for(int i = 0; i < imgList.size(); i++){
			 imgList.get(i).setMarket_id(market.getMarket_id());
			 /*System.out.println( "market_id : "+imgList.get(i).getMarket_id());*/
		 } 
		 // 이미지 정보 추가
		for(int i=0; i < imgList.size(); i++){
			getSqlSession().insert("Img.insert", imgList.get(i));
		}
		throw new RuntimeException();	
	}



	@Override
	public List areaSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Area.selectAll");
		System.out.println(list.size());
		return list;
	}

}
