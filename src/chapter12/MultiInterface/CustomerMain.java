package chapter12.MultiInterface;

import java.util.concurrent.CountDownLatch;

public class CustomerMain {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("----------Buy-----------");

		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		buyer.order();

		System.out.println("----------Sell-----------");

		Sell seller = customer;
		seller.sell();
		seller.sellorder();
		// seller.order();
		// seller부모/Customer자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;// 자식이 부모를 받을수 없기때문에 앞에 (Customer)를 붙여 형변환해준다.
			System.out.println("----Down Chasting----");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
		}

		customer.order();
	}
}
