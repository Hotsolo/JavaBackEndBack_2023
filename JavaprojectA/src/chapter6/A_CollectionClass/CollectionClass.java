package chapter6.A_CollectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Collection Framework
// 배열 형태의 데이터를 보다 편하게 사용할 수 있도록 해주는 클래스들의 집합

public class CollectionClass {

	public static void main(String[] args) {
		
		// Set 클래스
		// 집합 > 중복을 허용하지 않고 순서가 없는 형태
		
		//Hashset<E>: 중복을 허용하지 않고 순서가 없음 
		//순서가 없기 때문에 인덱스 사용이 불가능하다
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(4);
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(2);
		
		Iterator<Integer> iterator = integerSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
		//TreeSet<E> ; 중복을 허용하지 않고 순서가 없는 형태 + 정렬
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(131);
		treeSet.add(13145);
		treeSet.add(1341);
		treeSet.add(131435);
		treeSet.add(131435);

		
		
		for (Integer item: treeSet) {
			System.out.println(item);
		}
		
		
		
		System.out.println("================");
		
		
		
		// List
		// 데이터를 일렬로 나열한 구조
		// 순서가 존재하고 중복이 허용된다 (배열)
		
		
		// ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'
		List<String> list = new ArrayList<String>();
		
		//길이를 지정하지 않고 쓸 수 있음
		list.add("apple");
		list.add(0,"banana");
		
		//변경
		list.set(0, "BaBaBA");
		//데이터 확인
		System.out.println(list.toString());
		// 데이터 삭제
		list.remove(1);
		
		
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		
		// LinkedList<E? : 순서 존재, 중복 허용된 배열
		// 				   각 요소가이전 요쇼의 다음 요소의 주소를 같이 가지고 있음
		//				   검섹 속도가 빠름
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
//		long startTime = System.currentTimeMillis();
//		for (int integer = 0; integer < 5_000_000; integer++) {
//			arrayList.add(0,integer);
//			long endTime = System.currentTimeMillis();
//			}
		
		
		
		
		
		
		// map key와 value가 하나의 쌍으로 저장되는 구조.
		// 순서가 중요하지 않음, 단 key를 이용해서 특정한 값을 가져올 수 있다.
		
		// HashMap<E,E>
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("key", "value");
		hashMap.put("apple", "사과");
		
		System.out.println(hashMap.get("apple"));
		
		
		
		
		
		Set<Integer> lotto = new TreeSet<>();
		
		while (lotto.size() < 6 ) {
			Random random = new Random();
			
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		
		System.out.println(lotto.toString());
		
	}

}
