package com.favorite.model;

import java.util.List;

public interface FavoriteService {
	public List selectAll(int agree);
	public void insert(Market market);
}
