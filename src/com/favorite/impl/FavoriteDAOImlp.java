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
		getSqlSession().insert("Place.insert", place);
		// �߰��� ��ġ ���� id ������
		 market.setPlace_id(place.getPlace_id());
		 // �������� �߰�
		 getSqlSession().insert("Market.insert", market);
		 // ���� id �̹��� ������ �߰�
		 for(int i = 0; i < imgList.size(); i++){
			 imgList.get(i).setMarket_id(market.getMarket_id());
			 /*System.out.println( "market_id : "+imgList.get(i).getMarket_id());*/
		 } 
		 // �̹��� ���� �߰�
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
