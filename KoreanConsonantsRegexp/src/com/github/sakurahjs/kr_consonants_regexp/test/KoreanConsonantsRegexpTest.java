package com.github.sakurahjs.kr_consonants_regexp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.sakurahjs.kr_consonants_regexp.KoreanConsonantsRegexp;

public class KoreanConsonantsRegexpTest {

	KoreanConsonantsRegexp regexp = new KoreanConsonantsRegexp();
	
	@Test
	public void testCreate() {
		String result = regexp.create("우리집ㅈㄱㅇ");
		
		assertEquals("^.*\\s?우\\s?리\\s?집\\s?[자-짛]\\s?[가-깋]\\s?[아-잏]\\s?.*$", result);
	}

	@Test
	public void example() {
		String result = regexp.create("우리집ㅈㄱㅇ");
		
		String list[] = {"안녕하세요.", "우리 집 자가용은 경차.", "언덕 위 우리 집 조경은 예뻐요.", "우리 집은 저기예요."};
		
		for (String s : list) {
			if (s.matches(result)) {
				System.out.println(s);
			}
		}
	}
}
