package com.favorite.model;

import java.util.List;

public interface FavoriteService {
	// 가계 정보 불러오기
	public List selectAll(int agree);
	// 가계 정보 추가
	public void insert(Market market);
	// 지역 정보 불러오기
	public List areaSelectAll();
	// 업종 정보 불러오기
	public List businessSelectAll();
	// 즐겨 찾기 정보 불러오기
	public List bookmarkSelectAll(Bookmark bookmark);
	// 사용자 정보 추가 및 불러오기
	public User userInsertAndSelect(User user);
	
	

}
