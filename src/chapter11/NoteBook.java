package chapter11;

public abstract class NoteBook extends Computer {

	// 상속받은 두개의 추상 메소드 중 하나만 정의해서 사용할 경우 추상클래스로 구현해야함(abstract)

	@Override
	public void display() {
		System.out.println("NoteBook Display();");

	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub

	}

}
