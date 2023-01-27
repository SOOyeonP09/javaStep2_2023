package chapter10;

import java.security.PublicKey;
import java.util.Scanner;

public class CalcMain extends CalculatorExam {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		CalculatorExam[] calculators = { new CalPlus(), new CalMinus() };
		/*
		 //방법1
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		//.getClass().getSimpleName() :클래스명 가져오기
		for (CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));

		}
		 */
		
		
		//방법2
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
		int plus = calc(new CalPlus(),a,b);//calc c1=new CalcPuls():
		System.out.println("두 수의 합 : "+plus);
		int minus=calc(new CalMinus(),a,b);//calc c1=new CalcPuls():
		System.out.println("두 수의 차 : "+minus);
		
		/*
		//방법3
		System.out.println("두 수의 합 : "+calc(new CalPlus(),a,b));
		System.out.println("두 수의 차 : "+calc(new CalMInus(),a,b));
		
		*/
	}
	
	
	
	public static int calc(CalculatorExam c1,int a,int b) {
		return c1.getResult(a, b);
	}
	
	}


