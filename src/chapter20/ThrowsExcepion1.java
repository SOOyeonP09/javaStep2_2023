package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcepion1 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);

		return c;

	}

	public static void main(String[] args) {
		ThrowsExcepion1 test = new ThrowsExcepion1();

		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
