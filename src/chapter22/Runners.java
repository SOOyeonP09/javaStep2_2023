package chapter22;

import java.util.Random;

public class Runners {

	public static void runner () {

		int[] playerRandom = new int[5];
		String[] playerJump = { "", "", "", "", "" };

		boolean finish = false;
		int finishPlayer = 0;

		while (true) {
			// 도약거리
			for (int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(4);// 0~3 //3 1 1 1 2
			}

			// 0.1초 간격으로 휴식
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 각 선수에게 도약거리 적용
			for (int i = 0; i < playerJump.length; i++) {

				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += " ";
					break;
				case 1:
					playerJump[i] += "  ";
					break;
				case 2:
					playerJump[i] += "   ";
					break;
				case 3:
					playerJump[i] += "    ";
					break;

				default:
					break;
				}// switch
			} // for

			// 달리기
			System.out.println("-----------------------------------------------------");

			for (int i = 0; i < playerJump.length; i++) {
				System.out.print(playerJump[i]);
				System.out.println(i + 1 + "옷");

				if (playerJump[i].length() >= 50) {
					finishPlayer = i + 1;
					finish = true;
				}
			} // for

			System.out.println("-----------------------------------------------------");

			// 결산
			if (finish) {
				System.out.println("WINNER - " + finishPlayer);
				break;
			}

		} // while

	}

}
