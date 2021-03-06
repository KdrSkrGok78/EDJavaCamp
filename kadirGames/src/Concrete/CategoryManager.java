package Concrete;

import Abstract.ICategoryService;
import Entities.Category;

public class CategoryManager implements ICategoryService{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " : eklenmiştir.");
		
	}
	
	@Override
	public void addBulk(Category[] categories) {
		for (Category category : categories) {
			this.add(category);
		}		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName() + " : güncellenmiştir.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName() + " : silinmiştir.");
		
	}
}
