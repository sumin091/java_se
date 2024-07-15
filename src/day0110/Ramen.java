package day0110;

public class Ramen {
	
	int ramenPowder,ramenFlake;
	private String shape, color;

	public Ramen() {
		
		ramenPowder=1;
		ramenFlake=1;
		shape="원형";
		color="빨간";
		
	}
	
	public Ramen(int ramenPowder, int ramenFlake, String shape, String color) {
		
		this.ramenPowder=1;
		this.ramenFlake=1;
		this.setShape("원형");
		this.setColor("빨간");
		
	}//Ramen
	
	
	public void setRamenPowder(int ramenPowder) {
		
		if(ramenPowder != 1) {
			ramenPowder=1;
		}
		
		this.ramenPowder=ramenPowder;
	}//setRamenPowder
	
	
	public int getRamenPowder() {
		return ramenPowder;
	}//getRamenPowder
	
	
	public void setRamenFlake(int ramenFlake) {
		
		this.ramenFlake=ramenFlake;
	}//setRamenFlake
	
	public int getRamenFlake() {
		return ramenFlake;
	}//getRamenFlake
	
	public void setShape(String shape) {
		
		if(shape.equals("원형")) {
			shape="원형";
		}else {
			shape="사각형";
		}
		
		this.shape=shape;
		
	}//setShape
	
	public String getShape() {
		return shape;
	}//getShape

	public void setColor(String color) {
		
		if(color.equals("빨강")) {
			color="빨강";
		}else if(color.equals("노란")) {
			color="노란";
		}else if(color.equals("주황")) {
			color="주황";
		}
		
		this.color=color;
		
	}//setColor
	
	public String getColor() {
		return color;
	}//getColor
	
	
	
	public String eat(String msg) {
		return "\""+msg+"\"" +":  면이 "+shape+" 이고 봉지색은 "+color+ "색이다.";
	}//eat
}
