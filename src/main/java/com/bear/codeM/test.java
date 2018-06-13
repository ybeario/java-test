package com.bear.codeM;

import java.util.IdentityHashMap;
import java.util.Map;

public class test {
public static void main(String[] args) {
	Map<Integer, Integer> map=new IdentityHashMap<>();
	map.put( new Integer(Integer.parseInt("123")), 456);
	map.put( Integer.parseInt("123"), 231);
	map.forEach((k,v)->{
		System.out.println(k+"    "+v);
	});
}
}
