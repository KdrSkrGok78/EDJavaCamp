package Entities;

import Abstract.IEntity;

public class Category implements IEntity{

	private int categoryId;
	private String categoryName;
	
	public Category(int categoryId,String categoryName) {
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
