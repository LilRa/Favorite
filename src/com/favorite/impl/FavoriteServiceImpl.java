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
	// ���� ���� �ҷ�����
	@Override
	public List selectAll(int agree) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.selectAll(agree);
		return list;
	}
	// ���� ���� �߰�
	@Override
	public void insert(Market market) {
		// TODO Auto-generated method stub
		System.out.println(market.getMarket_title());
		favoriteDAO.insert(market);

	}
	// ���� ���� �ҷ�����
	@Override
	public List areaSelectAll() {
		// TODO Auto-generated method stub
		List list = favoriteDAO.areaSelectAll();
		return list;
	}
	// ���� ���� �ҷ�����
	@Override
	public List businessSelectAll() {
		// TODO Auto-generated method stub
		List list = favoriteDAO.businessSelectAll();
		return list;
	}
	// ��� ã�� ���� �ҷ�����
	@Override
	public List bookmarkSelectAll(Bookmark bookmark) {
		// TODO Auto-generated method stub
		List list = favoriteDAO.bookmarkSelectAll(bookmark);
		return list;
	}
	// ����� ��� ���� üũ �� ���
	@Override
	public User userInsertAndSelect(User user) {
		// TODO Auto-generated method stub
		//��ϵǾ� �ִ� ���� ���� üũ
		User result = favoriteDAO.userSelectOne(user);
		if(result == null){
			// ��� �Ǿ� ���� �ʴٸ� ���
			favoriteDAO.userInsert(user);
			result = user;
		}
		return result;
	}

}
