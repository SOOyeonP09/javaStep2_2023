package chapter21.outputstream;

import java.io.FileOutputStream;

import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {

		//FileOutputStream fos = new FileOutputStream("output1.txt");
		FileOutputStream fos = new FileOutputStream("output2.txt");

		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65;// A

			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			//fos.write(bs); // 배열 한꺼번에 저장=>input1.txt
			fos.write(bs,2,10);//배열의 2번방부터 10개만 저장 => input2.txt
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장이 완료되었습니다.");

	}

}
