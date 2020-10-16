package com.mrmmcann.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public int getHighestNumber(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public List<String> searchString(List<String> strings) {
		String firstString = strings.get(0);
		List<String> searchStrings = new ArrayList<>();

		for (String string : strings) {
			if (!string.equalsIgnoreCase(firstString)) {
				if (string.contains(firstString)) {
					searchStrings.add(string);
				}
			}
		}
		return searchStrings;
	}

	public String getFrequentWord(List<String> strings) {
		Map<String, Integer> stringMap = new HashMap<>();
		for (String string : strings) {
			if (stringMap.containsKey(string)) {
				stringMap.put(string, stringMap.get(string) + 1);
			} else {
				stringMap.put(string, 1);
			}
		}

		int max = 1;
		String maxString = "";
		for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxString = entry.getKey();
			}
		}

		return "\"" + maxString + "\" " + max;
	}
}
