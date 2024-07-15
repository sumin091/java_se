package day0124;

import java.util.List;
import java.util.Stack;

/**
 * LIFO
 */
public class UseStack {

	public UseStack() {
		//1.생성) is a 관계의 객체화는 하지 않는다.
//		List<String> list= new Stack<String>();
		Stack<String> stk= new Stack<String>();		//자식클래스를 생성
		
		//2.값 할당) item
//		stk.add("입니다.");	//부모의 method를 사용하지 않는다.
//		stk.add("수요일");
//		stk.add("오늘은");
		
		stk.push("입니다.");
		stk.push("오늘은");
		stk.push("수요일");
		
		//3.값 얻기) - pop() -얻어낸 item은 stack에서 사라진다.
//		System.out.println(!stk.empty());
		
		while(!stk.empty()) {	//스택에 아이템이 존재하지 않으면 반복하지 않는다.
			System.out.println(stk.pop());
		}//end while
		
//		for(int i=0; i< stk.size(); i++) {	//부모의 method 사용하지 않음
//			System.out.println(stk.get(i));	//get()으로 추출하면 사라지지 않음
//		}//end for
		
		System.out.println(stk.empty());
		
	}//UseStack
	
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
