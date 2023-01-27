package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		// VIP고객
		int price = 10000;
		System.out.println("---------------VIP고객-------------");
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);

		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "님이 " + vipprice + "원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		System.out.println();
		System.out.println("-------------일반고객---------------");
		price = 10000;
		// 방법1
		// Customer cs1=new Customer();
		// cs1.setCustomerName("홍길숙");
		// System.out.println(cs1.customerName + "님이 " + cs.calcPrice(price) + "원을 지불완료하였습니다");
		// System.out.println(cs1.showCustomer());

		// 방법2
		Customer cs = new Customer(1000, "홍길숙");
		System.out.println(cs.customerName + "님이 " + cs.calcPrice(price) + "원을 지불 완료하였습니다");
		System.out.println(cs.showCustomer());
	}

}
