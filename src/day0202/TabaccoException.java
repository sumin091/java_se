package day0202;

@SuppressWarnings("serial")
public class TabaccoException extends Exception {	//CompileException으로 만들때
	
	public TabaccoException() {
		super("담배는 질병의 원인이 되며.. 청소년 판매금지 ");
	}//TabaccoException
	
	public TabaccoException(String msg) {
		super(msg);
	}//TabaccoException
}
