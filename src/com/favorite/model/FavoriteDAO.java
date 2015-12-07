package com.favorite.model;

import java.util.List;

public interface FavoriteDAO {
	// 가계 정보 불러오기
	public List selectAll(int agree);
	// 가계 정보 추가
	public void insert(Market market);
	// 지역정보 불러오기
	public List areaSelectAll();
	// 업종 정보 불러오기
	public List businessSelectAll();
	// 즐겨찾기 정보 불러오기
	public List bookmarkSelectAll(Bookmark bookmark);
	// 유저 정보 추가
	public void userInsert(User user);
	// 유저 정보 불러오기
	public User userSelectOne(User user);
	// 즐겨찾기 정보 변경

}
