package chapter19.lambda;

interface PrintString {

	void showStirng(String str);

}

public class TestLambda {

	public static void main(String[] args) {

		// 람다식
		PrintString lambdaStr=s-> System.out.println(s);//함수명을 변수명으로 대체
		showMyString(lambdaStr);
		
		PrintString reStr=returnString(); // returnString()메소드 안에 있는 람다식 구현부 호출
		reStr.showStirng("Hello");

	}

	public static void showMyString(PrintString p) {// 매개변수 구현 => p가 body부분이 되는것
		p.showStirng("Hello Lambda");
	}

	public static PrintString returnString() {// 반환값으로 body구현
		return s -> System.out.println(s + " World");
	}
}
