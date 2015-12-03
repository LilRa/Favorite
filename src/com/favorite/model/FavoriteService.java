package com.favorite.model;

import java.util.List;

public interface FavoriteService {
	// ���� ���� �ҷ�����
	public List selectAll(int agree);
	// ���� ���� �߰�
	public void insert(Market market);
	// ���� ���� �ҷ�����
	public List areaSelectAll();
	// ���� ���� �ҷ�����
	public List businessSelectAll();
	// ��� ã�� ���� �ҷ�����
	public List bookmarkSelectAll(Bookmark bookmark);
	// ����� ���� �߰� �� �ҷ�����
	public User userInsertAndSelect(User user);
	
	

}
