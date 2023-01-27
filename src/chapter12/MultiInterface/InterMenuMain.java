package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3 {

	public static void main(String[] args) {
		InterMenuMain im = new InterMenuMain();
		// 부모 = 자식
		Inter_Menu1 im1 = im;// 업캐스팅 - 부모가 자식을 부르는것 /자식이 부모를 부를때 - 다운캐스팅
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		System.out.println("-----Inter_Menu1-----");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();

		System.out.println("-----Inter_Menu2-----");
		System.out.println(im2.tangsuyuck());

		System.out.println("-----Inter_Menu3-----");
		System.out.println(im3.boggembab());
	}

	@Override
	public String jajang() {
		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		return "해장하세요";

	}

	@Override
	public String tangsuyuck() {
		return "찹살 탕수육";
	}

	@Override
	public String boggembab() {
		return "해물 볶음밥이 짱!!";
	}

}
