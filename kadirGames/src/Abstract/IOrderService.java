package Abstract;

import Entities.Order;

public interface IOrderService {

	void add(Order order);
	void addBulk(Order[] orders);
	void update(Order order);
	void delete(Order order);
}
