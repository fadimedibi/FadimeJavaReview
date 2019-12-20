package com.review13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TableDemo {

	public static void main(String[] args) {

		Map<String, String> map1 = createMap();
		System.out.println(map1);
		Map<String, String> map2 = createMap2();
		System.out.println(map2);

		System.out.println("---------List of Maps----");
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(createMap3());
		System.out.println(mapList);
		System.out.println("----Map Iterator-----");
		Iterator<Map<String, String>> mapIterator = mapList.iterator();
		while (mapIterator.hasNext()) {
			Map<String, String> map = mapIterator.next();
			System.out.println(map);

			Set<Entry<String, String>> mapEntries = map.entrySet();
			Iterator<Entry<String, String>> entryIterator = mapEntries.iterator();
			while(entryIterator.hasNext()) {
				Entry<String,String> entry=entryIterator.next();
				String key=entry.getKey();
				String value=entry.getValue();
				System.out.println(key+"-->"+value);
			}
		}
	}

	public static Map<String, String> createMap() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Alfreds Futterkiste");
		map1.put("Contact", "Maria Anders");
		map1.put("Country", "Germany");
		return map1;
	}

	public static Map<String, String> createMap2() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Centro Commercial");
		map1.put("Contact", "Francisco");
		map1.put("Country", "Spain");
		return map1;
	}

	public static Map<String, String> createMap3() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Earnst Hendel");
		map1.put("Contact", "Roland Mendel");
		map1.put("Country", "France");
		return map1;
	}
}
