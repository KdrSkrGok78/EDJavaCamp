package Concrete;

import Abstract.ICategoryService;
import Entities.Category;

public class CategoryManager implements ICategoryService{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " : eklenmiþtir.");
		
	}
	
	@Override
	public void addBulk(Category[] categories) {
		for (Category category : categories) {
			this.add(category);
		}		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName() + " : güncellenmiþtir.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName() + " : silinmiþtir.");
		
	}
}
