package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");

	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");

	}

	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");

	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");

	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 읽습니다.");

	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");

	}

	public void flying() {
		System.out.println("독수리가 날게를 펴고 날아다닙니다.");

	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	// addAnimal -> 업캐스팅 메소드

	public void addAnimal() {

		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		AnimalTest aTest = new AnimalTest();

		for (Animal a : aniList) {
			a.move();
		} // for
	}// method

	// testCasting -> 다운캐스팅 메소드

	public void testCasting() {

		for (int i = 0; i < aniList.size(); i++) {
			Animal a = aniList.get(i);//부모 ArrayList의 객체를 a에 저장

			if (a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunting();

			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
			} else {
				System.out.println("지원되지 않는 타입입니다.");

			} // if
		} // for
	}// method

	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("----다운 캐스팅----");
		aTest.testCasting();
	}

}
