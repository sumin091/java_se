package day0119;

//ctrl+shift+o

import java.util.ArrayList;
//import java.sql.Date;		//패키지가 다르고 클래스명이 가타면 둘 중 하나면 import 가능
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import java.util.*;	//특정 패키지내의 모든 클래스를 import 할때

/**
 * 다른패키지에 존재하는 클래스를 가져다 사용할때
 * 
 */
public class TestImport {

	public static void main(String[] args) {
		Date d = new Date();
		Date d2= null;	//util.Date가 아니라 sql.Date를 사용하고 싶다
		Date d3= null;
		List l = new ArrayList();
		List l2 = new ArrayList();
		Map m = new HashMap();
	}// main

}// class
