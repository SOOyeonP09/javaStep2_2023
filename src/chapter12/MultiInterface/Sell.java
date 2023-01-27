package chapter12.MultiInterface;

public interface Sell {

	void sell();

	// 같은 이름이 default메소드는 존재할 수 없으므로 오버라이딩해줘야한다.
	// 최종 오버라이딩 메소드가 출력됨
	/*
	default void order() {

	}
*/
	default void sellorder() {
		System.out.println("판매 주문");
	}

}
