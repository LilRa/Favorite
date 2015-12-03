package com.favorite.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favorite.model.Bookmark;
import com.favorite.model.FavoriteDAO;
import com.favorite.model.FavoriteService;
import com.favorite.model.Market;
import com.favorite.model.User;
@Service
public class FavoriteServiceImpl implements  FavoriteService {
	@Autowired
	private FavoriteDAO favoriteDAO;
	// 가계 정보 불러오기
	@Override
	public List selectAll(int agree) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.selectAll(agree);
		return list;
	}
	// 가계 정보 추가
	@Override
	public void insert(Market market) {
		// TODO Auto-generated method stub
		System.out.println(market.getMarket_title());
		favoriteDAO.insert(market);

	}
	// 지역 정보 불러오기
	@Override
	public List areaSelectAll() {
		// TODO Auto-generated method stub
		List list = favoriteDAO.areaSelectAll();
		return list;
	}
	// 업종 정보 불러오기
	@Override
	public List businessSelectAll() {
		// TODO Auto-generated method stub
		List list = favoriteDAO.businessSelectAll();
		return list;
	}
	// 즐겨 찾기 정보 불러오기
	@Override
	public List bookmarkSelectAll(Bookmark bookmark) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.bookmarkSelectAll(bookmark);
		return list;
	}
	// 사용자 등록 정보 체크 및 등록
	@Override
	public User userInsertAndSelect(User user) {
		// TODO Auto-generated method stub
		//등록되어 있는 유저 인지 체크
		User result = favoriteDAO.userSelectOne(user);
		if(result == null){
			// 등록 되어 있지 않다면 등록
			favoriteDAO.userInsert(user);
			result = user;
		}
		return result;
	}

}
