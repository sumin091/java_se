package day0207;

import java.io.Serializable;

/**
 * 직렬화 방지 키워드: transient
 */
public class UserData implements Serializable {

		
	/**
	 * 이 객체를 식별할수 있는 ID
	 */
	private static final long serialVersionUID = -5854305321529184078L;
	private/* transient */String name;		
		//참조형 데이터는 직렬화 불가 > serializable 구현시에 가능     
		//transient  vs  serializable transient가 이김
		
		private double height;		//기본형 데이터형은 직렬화 지원
		private transient double weight;

		public UserData() {
			
		}
		
		public UserData(String name, double height, double weight) {
			this.name=name;
			this.height=height;
			this.weight=weight;
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		

		@Override
		public String toString() {
			return "UserData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
		}
		
		
		
		


}//class
