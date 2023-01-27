package chapter16.generic1;

class MyArray {

	private Object[] array = new Object[10];
	int i;

	public void add(Object obj) {
		array[i++] = obj;
	}

	public Object get(int index) {
		return array[index];
	}
}

public class MyArrayTest1 {

	public static void main(String[] args) {

		MyArray myarray1 = new MyArray();
		myarray1.add(new String("test"));
		String str = (String) myarray1.get(0);
		System.out.println(str);

		MyArray myarray2 = new MyArray();
		myarray2.add(new Integer(100));
		Integer num = (Integer) myarray2.get(0);
		System.out.println(num);
	}

}
