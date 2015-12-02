package com.favorite.model;

import java.util.List;

public interface FavoriteDAO {
	
	public List selectAll(int agree);
	public void insert(Market market);
}
