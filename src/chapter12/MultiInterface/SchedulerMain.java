package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");

			// 문자를 아스키코드로 형변환
			
			// 방법1
			// charAt(0); : 문자(char) 또는 문자열(String)을 int(ASCIICODE)로 변환해주는 것
			// char input = scan.next().charAt(0);
			
			// System.in.read() : 콘솔에 입력받기 모든 입력값을 아스키 코드값으로
			// int ch=System.in.read();//아스키코드값

			// 방법2
			String num = scan.nextLine();
			int ch = num.charAt(0);// charAt(0) 은 String => ASCII(Int)
			
			
			Scheduler scheduler = null;
			
			
			// 객체 생성

			if (ch == 'R' || ch == 'r') {
				// RoundRobin roundrobin = new RoundRobin();
				// roundrobin.getNextCall();
				// roundrobin.sendCallToAgent();
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else if (ch == 'S' || ch == 's') {
				System.out.println("종료합니다.");
				break;
			} else {
				continue;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();

		}

	}
}
