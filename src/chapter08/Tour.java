package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 관광객 등록
		System.out.print("관광객의 수 : ");
		int n = scan.nextInt();

		// 초기화를 통하여 메모리 확보 및 고객생성 Guide의 객체
		Guide guide = new Guide(n);
		System.out.println("관광객 등록");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". 이름 : ");
			String n1 = scan.next();
			guide.guest[i].setName(n1);
			System.out.print((i + 1) + ". 성별 : ");
			guide.guest[i].setGender(scan.next());
		}

		// -----------------------------------------------
		// 1,2,3 선택시 기능 구현

		outer: while (true) {
			System.out.println();
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.println();
			System.out.print("선택 >>");
			System.out.println();

			int ch = scan.nextInt();

			switch (ch) {
			case 1:
				for (int i = 0; i < n; i++) {
					System.out.println("1. 이름 : " + guide.guest[i].getName());
					System.out.println("1. 성별 : " + guide.guest[i].getGender());
					System.out.println("1. 목적지 : " + guide.guest[i].getPoint());
					System.out.println("--------------------------");
				}
				break;
			case 2:
				System.out.print("어디로 변경하시겠습니까 : ");
				Guide.point = scan.next();
				System.out.println(Guide.point + "로 목적지 변경");
				System.out.println();
				System.out.println("==========================");
				break;
			case 3:
				System.out.println("종료");
				break outer;

			}

		}

	}

}
