package day0117;

/**
 * 특정 클래스만 자식 클래스로 등록할때 sealed와 permits 사용
 */
public sealed class TestSuper permits Test1,Test2 {

	//	Test1,Test2가 존재하지 않으면 error
}//class
