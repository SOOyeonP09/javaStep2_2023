package chapter13;

class Outter2 {
	// 방법1
	// 익명의 클래스는 인스턴스 이름이 없다.
	Runnable getRunnable(int i) {

		int num = 100;// final
		// new 와 동시에 부모클래스의 run(Runnable)메소드를 상속받으므로 추상 메소드인 run을 반드시 오버라이딩해서 사용한다.
		return new Runnable() {

			@Override
			public void run() {
				// num=200;
				// i=10;
				System.out.println(i);
				System.out.println(num);

			}
		};// return
	}// Runnable

	// 방법2
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");

		}
	};// Runnable

}// outter2 class

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run(); // 방법1
		out.runner.run(); // 방법2

	}//Main

}//AnonyMousInnerMain class
