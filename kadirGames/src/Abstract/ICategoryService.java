package Abstract;

import Entities.Category;

public interface ICategoryService {

	void add(Category category);
	void addBulk(Category[] categories);
	void update(Category category);
	void delete(Category category);
}
