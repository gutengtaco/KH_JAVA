package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
//		List�迭�� Set�迭�� Collection�������̽��� �ڽ�(add,set,remove���� �޼ҵ��� ���°� ����)�ӿ� ����
//		Map�迭�� Collection�� �ڽ��� �ƴ�.
		HashMap<String, Snack> hm = new HashMap<>();
//				�ĺ���(Ű)	
		
//		1. put(K key, V value) 
//		=> Map������ key�� value�� ��Ʈ�� �߰�.
		hm.put("������", new Snack("���츶���",200));
		hm.put("����Ĩ", new Snack("�����򷯽�",400));
		hm.put("����Ĩ", new Snack("�׳�..���ĸ�?",300));
		hm.put("�����", new Snack("�����",500));
		
		System.out.println(hm);
//		=> ���� ���� ���� X
		
		hm.put("��������Ĩ", new Snack("�׳�..���ĸ�?",300));
		System.out.println(hm);
//		=> Key���� �ߺ����� �ʴ´ٸ�, value�� �ߺ��Ǵ���  �� �����.
		
		hm.put("�����", new Snack("�ſ�����",600));
		System.out.println(hm);
//		=> Key���� �ߺ��Ǹ�, �������� ������� value�� �����.
//		=> �������� ���� ������� ������.
		
//		2. get(Object key) : V 
//		=> �ش� Key���� value�� �����ִ� �޼ҵ�
		System.out.println(hm.get("����Ĩ"));
		System.out.println(hm.get("�����"));
//		Snack s = (Snack)hm.get("�����"); // ���׸��� �������� ������, ����ȯ ���־�� ��.
		
//		3.size(); 
//		=> HashMap ��ü�� ����ִ� �ڷ��� ������ ��ȯ���ִ� �޼ҵ�
		System.out.println("size : "+hm.size());
		
//		4.replace(K key, V value) 
//		=> HashMap��ü�� �ش� Key���� ã�Ƽ� ���� ���޵� Value�� �ٲ��ִ� �޼ҵ�
//		=> put()�� ���ʿ� ���� ���� �߰��ϴ� �뵵��, Key���� �ߺ��Ǹ� ���������, Key���� �ߺ����� ������ �߰��ϴ� ����
//		=> replace()�� ���ʿ� �ִ� Key���� ã�Ƽ� value�� �ٲ��ִ� �뵵
		hm.replace("����Ĩ", new Snack("�����̸�",350));
		System.out.println(hm);
		
//		5.remove(Object Key) 
//		=> HashMap���κ��� Key����  �ش��ϴ� Key + Value�� �Բ� �����ִ� �޼ҵ�
		hm.remove("�����");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println("--------------------------------------------------------------------------------------");
		
//		���������� HashMap�� �ִ� �����͵��� �����ϰ��� �� ��
//		[����] Set�� �ݺ������� ���� ��.
//		1. ���� for�� => ���� ����ο� Key+value�� ��Ʈ�� ������ ���� �Ұ�
//		2. ArrayList�� �ű�� ��� => �θ� �ٸ� �迭�̱� ������, �ű�� �� �Ұ�
//		3. .iterator() : Map�迭������ ��� �Ұ�
//		=> Map�迭���� �����ϴ� �޼ҵ� 2������ �̿�(Map�� Set���� �ٲ���)
		
//		Map�� Set���� �ٲ��ִ� �޼ҵ�
//		1. KeySet() : HashMap�� �ִ� Key�鸸 Set���� �Ű��ִ� ����.
		Set<String> keySet = hm.keySet();
//		�� ������ Set�� ���������. => 1,2,3���� �ش��ϴ� �ݺ��� ��� ��� ����.
//			.iterator() ������� �ݺ� ��������
			Iterator<String> itKey = keySet.iterator();
			while(itKey.hasNext()){
				String key = itKey.next(); // HashMap�� �ִ� Key���� ��.
				Snack s = hm.get(key);
				System.out.println("Key : "+key + " / Value : "+s);
			}
		
			System.out.println("--------------------------------------------------------------------------------------");
//		2. entrySet() : HashMap�� �ִ� Key + value ��� Set���� �Ű��ִ� ����(Entry ��������)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
//		�� ������ Set�� ��������� => 1,2,3���� �ش��ϴ� �ݺ��� ��� ��� ����
//			iterator()
			Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
			while(itEntry.hasNext()) {
				Entry<String, Snack> entry = itEntry.next();
				System.out.println("Key : "+entry.getKey()+" / value : "+entry.getValue());
			}
	}

}
