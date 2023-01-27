package chapter14;

//Wrapper(웹퍼)

public class IntegerTest {

	public static void main(String[] args) {

		// Integer i=new Integer(100);//int i=100으로도 쓰긴함

		Integer num = 100;// 일반자료형이 아니라 클래스로 선언된것 = 오토박싱

		int iNum = num.intValue();// ㄴ클래스인데 일반자료로 바꾼것 = 언박싱

		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);// 언박싱이 잘된것

		// 언박싱(Integer=>int) Integer를 일반형으로 바꾼것=언박싱
		int total = num + jNum; // num이 클래스라 num.intValue+jNum해야하지만 아래와같이 값이 잘 나옴= 언박싱이 잘된것
		System.out.println(total);

		// 오토박싱(int=> Integer)//일반자료인데 클래스로 바뀐것=오토박싱
		Integer i = jNum; // jNum은 int였지만 Integer로 사용된것
		System.out.println(i); // Integer.valueOf(jNum)로 변환하는것과 같은것

	}

}
