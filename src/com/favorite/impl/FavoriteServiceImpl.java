package com.favorite.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favorite.model.FavoriteDAO;
import com.favorite.model.FavoriteService;
import com.favorite.model.Market;
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
	@Override
	public List bookmarkSelectAll(int user_id) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.bookmarkSelectAll(user_id);
		return list;
	}

}
