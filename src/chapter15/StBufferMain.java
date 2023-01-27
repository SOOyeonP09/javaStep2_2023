package chapter15;

public class StBufferMain {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		System.out.println(buf.length());//길이가 8개라는 뜻
		//StringBuffer의 기본 용량 16이 들어가있고 +추가분(8) 해서 24가 나온것
		System.out.println(buf.capacity()); //24
		//24를 넘어가면 허용범위(25~50)까지는 갖고있는 용량*2+2=50 무조건 50으로 나온다./ 51부터는 갖고있는 용량으로 표현된다.
		buf.ensureCapacity(25);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(12, " Everybody! ");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
	}

}
