package day0123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

/**
 * ArrayList, Vector 의 사용
 */
public class UseList2 {

	/**
	 * 동기화 처리가 되어있지 않으므로 Vector 보다 속도 빠름
	 */
	public void useArrayList() {
		// 1.생성
		List<String> list = new ArrayList<String>();

		// 2.값 할당 객체명.add(값);
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java"); // 중복값허용
		list.add("HTML");
		list.add("CSS");

		// 2번재 방 위치 (JDBC)에 "자바" 추가 (기존요소 사이에 추가)
		list.add(2, "자바");

		// 3.크기
		System.out.println(list.size() + "개");

		// 배열로 복사
		// 1.리스트의 크기대로 빈 배열생성
		String[] arr = new String[list.size()];

		// 2.복사
		list.toArray(arr);

		// 모든 방의 값 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// 개선된 for문
		for (String value : list) {
			System.out.println(value);
		} // end for

		// 값 삭제 remove(인덱스),remove(요소의 값) 크기가 준다.
//		list.remove(1);
//		list.remove("Java");	//같은 값이 있다면 처음 값만 삭제
		list.clear();

		System.out.println(list + "/" + list.size());

		// 배열에 복사된 값 출력
		for (String value : arr) {
			System.out.println(value + " ");
		} // end for

		System.out.println();
	}// useArrayList

	/**
	 * 동기화가 되기 때문에 여러 객체 동시 접근 불가. ArrayList보다 속도 느림
	 */
	public void useVector() {
		// 1.생성
		List<String> list = new Vector<String>();

		// 2.값 할당 객체명.add(값);
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java"); // 중복값허용
		list.add("HTML");
		list.add("CSS");

		// 3.크기
		System.out.println(list.size() + "개");

		// 배열로 복사
		// 1.리스트의 크기대로 빈 배열생성
		String[] arr = new String[list.size()];

		// 2.복사
		list.toArray(arr);

		// 모든 방의 값 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// 개선된 for문
		for(String value: list) {
			System.out.println(value);
		}//end for
	

		// 값 삭제 remove(인덱스),remove(요소의 값) 크기가 준다.
//		list.remove(1);
//		list.remove("Java");	//같은 값이 있다면 처음 값만 삭제
		list.clear();

		System.out.println(list + "/" + list.size());

		// 배열에 복사된 값 출력
		for (String value : arr) {
			System.out.println(value + " ");
		} // end for

		System.out.println();

	}// useVector

	public void useLinkedList() {
		// 1.생성
		List<String> list = new LinkedList<String>();

		// 2.값 할당 객체명.add(값);
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java"); // 중복값허용
		list.add("HTML");
		list.add("CSS");

		list.add(1, "자바"); // 기존 데이터 사이에 값을 추가
		// 3.크기
		System.out.println(list.size() + "개");

		// 배열로 복사
		// 1.리스트의 크기대로 빈 배열생성
		String[] arr = new String[list.size()];

		// 2.복사
		list.toArray(arr);

		// 모든 방의 값 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// 개선된 for문
//		for(String value: list) {
//			System.out.println(value);
//		}//end for

		System.out.println("Iterator를 사용한 출력");

		Iterator<String> ita = list.iterator();
		while (ita.hasNext()) {
			System.out.println(ita.next());
		} // end while
			// 값 삭제 remove(인덱스),remove(요소의 값) 크기가 준다.
//		list.remove(1);
//		list.remove("Java");	//같은 값이 있다면 처음 값만 삭제
		list.clear();

		System.out.println(list + "/" + list.size());

		// 배열에 복사된 값 출력
		for (String value : arr) {
			System.out.println(value + " ");
		} // end for

		System.out.println();

	}// useVector

	public static void main(String[] args) {
		UseList2 ul = new UseList2();
		System.out.println("----------ArrayList--------------");
		ul.useArrayList();
		System.out.println("-----------Vector-------------");
		ul.useVector();
		System.out.println("-----------useLinkedList-------------");
		ul.useLinkedList();
		
		JOptionPane.showInputDialog("값을 입력해주세요");
	}

}
