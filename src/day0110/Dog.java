package day0110;

public class Dog {

	int eye, nose, ear;
	private String color, breed ;
	
	public Dog() {
		eye=2;
		nose=1;
		ear=2;
		color="brown";
		breed="시바견";
		
	}//Dog
	
	public Dog(int eye, int nose, int ear, String color, String breed) {
		this.eye=eye;
		this.nose=nose;
		this.ear=ear;
		this.setColor(color);
		this.setBreed(breed);
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
	
	
	public void setBreed(String breed) {
		
		if(breed.equals("치와와")) {
			breed="치와와";
		}else if(breed.equals("시베리안허스키")) {
			breed="시베리안허스키";
		}else if(breed.equals("시바견")) {
			breed="시바견";
		}
		
		this.breed=breed;
	}//setBreed
	
	public String getBreed() {
		return breed;
	}
	
	
	public String bark(String msg) {
		
		return  "색은 "+color+"이고 품종은 "+breed+"인 애완견은 "+msg+" 짖는다.";
	}//bark
	
	
}//class
