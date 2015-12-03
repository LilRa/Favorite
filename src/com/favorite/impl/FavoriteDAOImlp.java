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

	// �������� ����Ʈ ���
	@Override
	public List selectAll(int agree) {
		// TODO Auto-generated method stub
		 List list= getSqlSession().selectList("Market.selectAll",agree);
		return list;
	}
	
	// ���� ���� �Է�
	@Override
	public void insert(Market market) {
		// TODO Auto-generated method stub
		// ��ġ ���� ����
		Place place = market.getPlace();
		// �̹��� ���� ����
		List<Img> imgList = market.getImg();
		// ��ġ ���� DB�� �߰�
		if(getSqlSession().insert("Place.insert", place) == 0){
			throw new RuntimeException();	
		}
		// �߰��� ��ġ ���� id ������
		 market.setPlace_id(place.getPlace_id());
		 // �������� �߰�
		 if(getSqlSession().insert("Market.insert", market)==0){
				throw new RuntimeException();	
		 }
		 // ���� id �̹��� ������ �߰�
		 for(int i = 0; i < imgList.size(); i++){
			 imgList.get(i).setMarket_id(market.getMarket_id());
			 /*System.out.println( "market_id : "+imgList.get(i).getMarket_id());*/
		 } 
		 // �̹��� ���� �߰�
		for(int i=0; i < imgList.size(); i++){
			if(getSqlSession().insert("Img.insert", imgList.get(i)) == 0){
				throw new RuntimeException();	
			}
		}
		
	}


	// ���� ���� �ҷ���
	@Override
	public List areaSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Area.selectAll");
		System.out.println(list.size());
		return list;
	}
	// ���� ���� �ҷ�����
	@Override
	public List businessSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Business.selectAll");
		System.out.println(list.size());
		return list;
	}
	// ��� ã�� �ҷ�����
	@Override
	public List bookmarkSelectAll(Bookmark bookmark) {
		// TODO Auto-generated method stub
	
		List list = getSqlSession().selectList("BookMark.selectAll",bookmark);
	/*	Bookmark bookmark = (Bookmark)list.get(0);*/
		System.out.println(list.size());
	/*	System.out.println(bookmark.getUser_id());*/
		return list;
	}
	// ����� ���� ����
	@Override
	public void userInsert(User user) {
		// TODO Auto-generated method stub
		int result = getSqlSession().insert("User.insert",user);
		if(result == 0){
			throw new RuntimeException();	
		}	
	}
	// ����� ���� �˻�
	@Override
	public User userSelectOne(User user) {
		// TODO Auto-generated method stub
		User result = getSqlSession().selectOne("User.selectOne",user);
		return result;
	}


}
