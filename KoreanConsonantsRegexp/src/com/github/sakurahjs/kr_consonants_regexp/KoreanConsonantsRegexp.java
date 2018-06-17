package com.github.sakurahjs.kr_consonants_regexp;

public class KoreanConsonantsRegexp {
	public final char[] consonants =      {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅍ', 'ㅌ', 'ㅋ', 'ㅎ'};
	public final char[] startCharacters = {'가', '까', '나', '다', '따', '라', '마', '바', '빠', '사', '싸', '아', '자', '짜', '차', '파', '타', '카', '하'};
	public final char[] endCharacters =   {'깋', '낗', '닣', '딯', '띻', '맇', '밓', '빟', '삫', '싷', '앃', '잏', '짛', '찧', '칳', '핗', '팋', '킿', '힣'};
	
	public String create(String searchText) {
		String consonentString = new String(consonants);
		StringBuffer result = new StringBuffer("^.*\\s?");
		
		for (char ch : searchText.toCharArray()) {
			int consonentIndex = consonentString.indexOf(ch);
			if (consonentIndex < 0) {
				result.append(ch);
			} else {
				result.append("[" + startCharacters[consonentIndex] + "-" + endCharacters[consonentIndex] + "]");
			}
			result.append("\\s?");
		}
		result.append(".*$");
		
		return result.toString();
	}
	
	
}
