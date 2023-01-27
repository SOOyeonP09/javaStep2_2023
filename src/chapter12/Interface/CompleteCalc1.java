package chapter12.Interface;

import chapter11.Car;

public abstract class CompleteCalc1 implements Calc {

	// 상속받아서 add/substaract 구현

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int substaract(int num1, int num2) {

		return num1 - num2;
	}

}
