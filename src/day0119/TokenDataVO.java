package day0119;

import java.util.Arrays;

public class TokenDataVO {
	private String[] data;
	private int countToken;
	
	public TokenDataVO() {
		
	}//TokenDataVO
	
	public TokenDataVO(String[] data, int countToken) {
		this.data=data;
		this.countToken=countToken;
	}//TokenDataVO
	

	/**
	 * @return the data
	 */
	public String[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String[] data) {
		this.data = data;
	}

	/**
	 * @return the countToken
	 */
	public int getCountToken() {
		return countToken;
	}

	/**
	 * @param countToken the countToken to set
	 */
	public void setCountToken(int countToken) {
		this.countToken = countToken;
	}

	@Override
	public String toString() {
		return "TokenDataVO [data=" + Arrays.toString(data) + ", countToken=" + countToken + "]";
	}
	
	
	
	
}
