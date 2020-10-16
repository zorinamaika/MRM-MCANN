package com.mrmmcann.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();

		int[] intArray = new int[] { 1, 2, 5, 3, 2 };
		System.out.println(test.getHighestNumber(intArray));

		List<String> str = new ArrayList<>();
		str.add("ana");
		str.add("anastacia");
		str.add("bravo");
		str.add("banana");
		str.add("cabana");
		System.out.println(test.searchString(str));

		List<String> words = new ArrayList<>();
		words.add("the");
		words.add("quick");
		words.add("brown");
		words.add("fox");
		words.add("jumps");
		words.add("over");
		words.add("the");
		words.add("lazy");
		words.add("dog");
		System.out.println(test.getFrequentWord(words));
	}

}
