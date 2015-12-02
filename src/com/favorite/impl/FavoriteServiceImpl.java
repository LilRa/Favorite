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
	@Override
	public List selectAll(int agree) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.selectAll(agree);
		return list;
	}
	@Override
	public void insert(Market market) {
		// TODO Auto-generated method stub
		System.out.println(market.getMarket_title());
		favoriteDAO.insert(market);

	}

}
