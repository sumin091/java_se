package day0116;

public class Work0116VO {

	private String name;
	private String addr;
	private int age;
	
	
	
	
	public Work0116VO() {
		
			
	}//Work0116VO
	
	
	public Work0116VO( String name, String addr, int age) {
		
		this.age=age;
		this.name=name;
		this.addr=addr;
		
	}//Work0116VO

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
