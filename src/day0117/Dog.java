package day0117;

public abstract class Dog {

	int eye, nose, ear;
	private String name;
	private String msg, color/* , breed */ ;
	
	public Dog() {
//		eye=2;
//		nose=1;
//		ear=2;
//		color="brown";
//		breed="시바견";
		this(2, 1, 2, "시바견", "낯선 환경일때", "brown"/* ,"시바견" */);
		
	}//Dog
	
	public Dog(int eye, int nose, int ear, String name, String msg, String color/* , String breed */) {
		this.eye=eye;
		this.nose=nose;
		this.ear=ear;
		this.name=name;
		this.msg=msg;
		this.setColor(color);
		//this.setBreed(breed);
	}//Dog
	
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	public int getEye() {
		return eye;
	}//getEye
	
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	
	public int getNose() {
		return nose;
	}//getNose
	
	public void setEar(int ear) {
		this.ear=ear;
	}//setEar
	
	public int getEar() {
		return ear;
	}//getEar
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	
	public String getName() {
		return name;
	}//getName
	
	public void setMsg(String msg) {
		this.msg=msg;
	}//setMsg
	
	
	public String getMsg() {
		return msg;
	}//getMsg
	
	public void setColor(String color) {
		
		if(color.equals("black")) {
			color="balck";
		}else if(color.equals("brown")) {
			color="brown";
		}else if(color.equals("lightbrown")) {
			color="lightbrown";
		}
		
		this.color=color;
	}//setColor
	
	public String getColor() {
		return color;
	}//getColor
	
	
//	public void setBreed(String breed) {
//		
//		if(breed.equals("치와와")) {
//			breed="치와와";
//		}else if(breed.equals("시베리안허스키")) {
//			breed="시베리안허스키";
//		}else if(breed.equals("시바견")) {
//			breed="시바견";
//		}
//		
//		this.breed=breed;
//	}//setBreed
	
//	public String getBreed() {
//		return breed;
//	}
	
	public abstract String bark();
	
	public abstract String bark(String place, int count);

	@Override
	public String toString() {
		return "애완견입니다.";
	}
	
	
	
	
}//class
