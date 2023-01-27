package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

import chapter12.MultiInterface.Customer;

public class TravelTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

		// 객체생성
		TravelCustomer num1 = new TravelCustomer("홍길동", 30, 1000);
		TravelCustomer num2 = new TravelCustomer("김유신", 20, 2000);
		TravelCustomer num3 = new TravelCustomer("강아지", 10, 3000);

		// 추가
		customerList.add(num1);
		customerList.add(num2);
		customerList.add(num3);

		System.out.println("==고객 명단 추가된 순서대로 출력==");
		// map : 데이터를 특정조건에 해당하는 값으로 변환해 줌
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// mapToInt : int형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총  수입 : " + total);
		// filter : 특정 조건에 맞는 데이터만 걸러낸다.
		System.out.println("==20세 이상의 고객만 정렬항 출력==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}

}
