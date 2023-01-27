package chapter19.lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		// 인스턴스 방식
		System.out.println("--인스턴스 방식--");
		StringConCatimple a = new StringConCatimple();
		a.makeString(s1, s2);

		// 람다식 방식
		System.out.println("--람다식 방식--");
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Hello", "World");

		// 익명의 내부 클래스 방식
		System.out.println("--익명의 내부 클래스 방식--");
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);

			}
		};
		concat2.makeString(s1, s2); // 호출
	}

}
