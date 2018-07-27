package com.sree.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafeIteratorTest {

	public static void main(String[] args) {
		
		//Map<String, String> phoneMap = new HashMap<>();
		Map<String, String> phoneMap = new ConcurrentHashMap<>(); 
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperina");
			String phoneType =  iterator.next();
			
			System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
			
		}
	}
}
