package day0124;

public class WorkVO2 {
	
	private String name;
	private int java;
	private int oracle;
	
	
	public String getName() {
		return name;
	}

	public int getJava() {
		return java;
	}

	public int getOracle() {
		return oracle;
	}
	public WorkVO2() {
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public WorkVO2(String name, int java, int oracle) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
	}
	
	
	
}
