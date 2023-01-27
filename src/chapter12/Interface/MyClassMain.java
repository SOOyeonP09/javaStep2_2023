package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {

		// X,Y MyInterface 클래스 타입의 인스턴스 변수를 선언하여 출력

		MyClass mClass = new MyClass();

		X xclass = mClass;// X 클래스 타입의 인스턴스 변수
		xclass.X();
		System.out.println("-----------------------");

		Y yclass = mClass;// Y 클래스 타입의 인스턴스 변수
		yclass.Y();
		System.out.println("-----------------------");

		MyInterface iClass = mClass;
		iClass.Method();
		iClass.X();
		iClass.Y();
	}

}
