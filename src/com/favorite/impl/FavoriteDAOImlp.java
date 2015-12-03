package com.favorite.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.favorite.model.Bookmark;
import com.favorite.model.FavoriteDAO;
import com.favorite.model.Img;
import com.favorite.model.Market;
import com.favorite.model.Place;
import com.favorite.model.User;
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
		if(getSqlSession().insert("Place.insert", place) == 0){
			throw new RuntimeException();	
		}
		// 추가한 위치 정보 id 가져옴
		 market.setPlace_id(place.getPlace_id());
		 // 가계정보 추가
		 if(getSqlSession().insert("Market.insert", market)==0){
				throw new RuntimeException();	
		 }
		 // 가계 id 이미지 정보에 추가
		 for(int i = 0; i < imgList.size(); i++){
			 imgList.get(i).setMarket_id(market.getMarket_id());
			 /*System.out.println( "market_id : "+imgList.get(i).getMarket_id());*/
		 } 
		 // 이미지 정보 추가
		for(int i=0; i < imgList.size(); i++){
			if(getSqlSession().insert("Img.insert", imgList.get(i)) == 0){
				throw new RuntimeException();	
			}
		}
		
	}


	// 지역 정보 불러오
	@Override
	public List areaSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Area.selectAll");
		System.out.println(list.size());
		return list;
	}
	// 업종 정보 불러오기
	@Override
	public List businessSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Business.selectAll");
		System.out.println(list.size());
		return list;
	}
	// 즐겨 찾기 불러오기
	@Override
	public List bookmarkSelectAll(Bookmark bookmark) {
		// TODO Auto-generated method stub
	
		List list = getSqlSession().selectList("BookMark.selectAll",bookmark);
	/*	Bookmark bookmark = (Bookmark)list.get(0);*/
		System.out.println(list.size());
	/*	System.out.println(bookmark.getUser_id());*/
		return list;
	}
	// 사용자 정보 저장
	@Override
	public void userInsert(User user) {
		// TODO Auto-generated method stub
		int result = getSqlSession().insert("User.insert",user);
		if(result == 0){
			throw new RuntimeException();	
		}	
	}
	// 사용자 정보 검색
	@Override
	public User userSelectOne(User user) {
		// TODO Auto-generated method stub
		User result = getSqlSession().selectOne("User.selectOne",user);
		return result;
	}


}
