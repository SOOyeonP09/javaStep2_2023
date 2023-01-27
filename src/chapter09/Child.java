package chapter09;

public class Child extends Parent {

	@Override // 상속시 사용 (내꺼) 예전에잇엇지만 최근에 수정해서 수정한거 먼저 사용하고 싶을때
	public void method2() {
		System.out.println("Child-method2()");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}

}
