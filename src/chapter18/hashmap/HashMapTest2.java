package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String integer>생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 팀원데이터(성함,학번) 저장
		map.put("김우태", 1001);
		map.put("김창우", 1002);
		map.put("박수연", 1003);
		map.put("박범준", 1004);
		map.put("백유기", 1005);
		map.put("정세나", 1006);

		// 팀원의 인원

		System.out.println("총 인원 수 : " + map.size() + "명");

		// 팀장의 학번을 알아내자
		System.out.print("팀장 학번 : ");
		System.out.println(map.get("김창우"));
		System.out.println();

		// 팀원모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();// 키
			Integer value = map.get(key);// 키를 이용하여 값
			System.out.println(key + " : " + value);
		}
		System.err.println();

	}

}
