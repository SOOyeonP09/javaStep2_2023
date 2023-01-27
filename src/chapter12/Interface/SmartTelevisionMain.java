package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(15);
		tv.turnOff();
		tv.seatch("www.naver.com");
		System.out.println("-------------");
		
		// Remote 클래스에 정의 되어 있는 메소드만 오버라이딩이 인식되어 사용할 수 있다.
		Remote re = tv;
		re.turnOn();
		re.setVolume(-7);
		re.turnOff();
		// re.seatch("www.naver.com");
		System.out.println("-------------");
		
		
		Searchable sc = tv;
		/*
		sc.turnOn();
		sc.setVolume(-7);
		sc.turnOff();
		*/
		sc.seatch("www.naver.com");
	}

}
