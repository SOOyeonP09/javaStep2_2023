package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcepion2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);

		return c;

	}

	public static void main(String[] args) {
		ThrowsExcepion2 test = new ThrowsExcepion2();

		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {// 논리 연산자
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
