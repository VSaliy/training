package victor.training.java8.voxxed.order.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

	private List<Order> orders = new ArrayList<>();

	public final List<Order> getOrders() {
		return orders;
	}

	public final void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Customer(Order... orders) {
		this.orders = Arrays.asList(orders);
	}
	
}