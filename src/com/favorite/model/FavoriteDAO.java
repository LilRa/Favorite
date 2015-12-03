package com.favorite.model;

import java.util.List;

public interface FavoriteDAO {
	// ���� ���� �ҷ�����
	public List selectAll(int agree);
	// ���� ���� �߰�
	public void insert(Market market);
	// �������� �ҷ�����
	public List areaSelectAll();
	// ���� ���� �ҷ�����
	public List businessSelectAll();
	// ���ã�� ���� �ҷ�����
	public List bookmarkSelectAll(Bookmark bookmark);
	// ���� ���� �߰�
	public void userInsert(User user);
	// ���� ���� �ҷ�����
	public User userSelectOne(User user);
	// ���ã�� ���� ����

}
