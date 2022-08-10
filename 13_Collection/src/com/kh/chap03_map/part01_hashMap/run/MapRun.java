package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
//		List계열과 Set계열이 Collection인터페이스의 자식(add,set,remove등의 메소드의 형태가 같음)임에 반해
//		Map계열은 Collection의 자식이 아님.
		HashMap<String, Snack> hm = new HashMap<>();
//				식별자(키)	
		
//		1. put(K key, V value) 
//		=> Map공간에 key와 value를 세트로 추가.
		hm.put("꼬깔콘", new Snack("새우마요맛",200));
		hm.put("꼬북칩", new Snack("초코츄러스",400));
		hm.put("스윙칩", new Snack("그냥..양파맛?",300));
		hm.put("새우깡", new Snack("새우맛",500));
		
		System.out.println(hm);
//		=> 저장 순서 유지 X
		
		hm.put("포테이토칩", new Snack("그냥..양파맛?",300));
		System.out.println(hm);
//		=> Key값이 중복되지 않는다면, value가 중복되더라도  잘 저장됨.
		
		hm.put("새우깡", new Snack("매운새우맛",600));
		System.out.println(hm);
//		=> Key값이 중복되면, 마지막에 덮어씌워진 value가 저장됨.
//		=> 마지막에 넣은 새우깡만 존재함.
		
//		2. get(Object key) : V 
//		=> 해당 Key값의 value를 돌려주는 메소드
		System.out.println(hm.get("꼬북칩"));
		System.out.println(hm.get("새우깡"));
//		Snack s = (Snack)hm.get("새우깡"); // 제네릭을 설정하지 않으면, 형변환 해주어야 함.
		
//		3.size(); 
//		=> HashMap 객체에 들어있는 자료의 개수를 반환해주는 메소드
		System.out.println("size : "+hm.size());
		
//		4.replace(K key, V value) 
//		=> HashMap객체에 해당 Key값을 찾아서 새로 전달된 Value로 바꿔주는 메소드
//		=> put()은 애초에 없는 값을 추가하는 용도로, Key값이 중복되면 덮어씌워지고, Key값이 중복되지 않으면 추가하는 개념
//		=> replace()는 애초에 있는 Key값을 찾아서 value로 바꿔주는 용도
		hm.replace("꼬북칩", new Snack("인절미맛",350));
		System.out.println(hm);
		
//		5.remove(Object Key) 
//		=> HashMap으로부터 Key값에  해당하는 Key + Value를 함꼐 지워주는 메소드
		hm.remove("새우깡");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println("--------------------------------------------------------------------------------------");
		
//		순차적으로 HashMap에 있는 데이터들을 접근하고자 할 때
//		[참고] Set을 반복돌리고 싶을 때.
//		1. 향상된 for문 => 변수 선언부에 Key+value를 세트로 변수로 선정 불가
//		2. ArrayList로 옮기는 방법 => 부모가 다른 계열이기 때문에, 옮기는 것 불가
//		3. .iterator() : Map계열에서는 사용 불가
//		=> Map계열에서 제공하는 메소드 2가지를 이용(Map을 Set으로 바꿔줌)
		
//		Map을 Set으로 바꿔주는 메소드
//		1. KeySet() : HashMap에 있던 Key들만 Set으로 옮겨주는 역할.
		Set<String> keySet = hm.keySet();
//		이 시점에 Set이 만들어졌음. => 1,2,3번에 해당하는 반복을 모두 사용 가능.
//			.iterator() 방법으로 반복 돌려보기
			Iterator<String> itKey = keySet.iterator();
			while(itKey.hasNext()){
				String key = itKey.next(); // HashMap에 있던 Key값이 들어감.
				Snack s = hm.get(key);
				System.out.println("Key : "+key + " / Value : "+s);
			}
		
			System.out.println("--------------------------------------------------------------------------------------");
//		2. entrySet() : HashMap에 있던 Key + value 모두 Set으로 옮겨주는 역할(Entry 집합형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
//		이 시점에 Set이 만들어졌음 => 1,2,3번에 해당하는 반복을 모두 사용 가능
//			iterator()
			Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
			while(itEntry.hasNext()) {
				Entry<String, Snack> entry = itEntry.next();
				System.out.println("Key : "+entry.getKey()+" / value : "+entry.getValue());
			}
	}

}
