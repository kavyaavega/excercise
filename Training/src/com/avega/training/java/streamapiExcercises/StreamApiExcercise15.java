package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//15.Given a list of strings, return a new list that contains only the strings that are anagrams of the word "listen".
public class StreamApiExcercise15 {
	
	public static  List<String> findAnagrams(List<String> words){
		String target ="listen";
		return words.stream()
				.filter(word -> Arrays.equals(word.chars().sorted().toArray(),
						target.chars().sorted().toArray()))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen","silent","enlist","inlet");
		List<String> anagrams= StreamApiExcercise15.findAnagrams(words);
		System.out.println(anagrams);

	}

}
