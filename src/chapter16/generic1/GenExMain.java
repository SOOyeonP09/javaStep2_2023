package chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		// 사용자가 원하는 형태로 객체가 생성됨
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());

		// 정수, 실수, 문자
		// 제네릭 타입의 객체는 기본 자료형(int,double,char)을 인식할 수 없음
		// 그러므로 오토박싱하여 사용
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		GenEx<Double> v3 = new GenEx<Double>();
		v3.setValue(10.1);
		System.out.println(v3.getValue());
		GenEx<Character> v4 = new GenEx<Character>();
		v4.setValue('A');
		System.out.println(v4.getValue());
	}

}
