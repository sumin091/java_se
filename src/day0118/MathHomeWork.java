package day0118;

/**
 * 1. 아래의 데이터로 배열을 만들고, 임의의 방하나의 값을 출력<br>
 * "어쩔, 저쩔, 뇌절, 안물, 안궁, 때리, 못때리, 개킹"<br>
 * 2. 8자리의 영문자, 숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 method작성하고 출력<br>
 * 3. 로또번호(1~45의 수 중 하나를 뽑고, 6자리 세트)구하여 반환하는 method를 작성하고 사용.<br>
 * (중복값이 들어가면 안되고, 오름차순 정렬되어 출력)
 */
public class MathHomeWork {

	/**
	 * "어쩔, 저쩔, 뇌절, 안물, 안궁, 때리, 못때리, 개킹" 중에 하나 출력
	 */
	public MathHomeWork() {
		String[] noJam ="어쩔,저쩔,뇌절,안물,안궁,때리,못때리,개킹".replaceAll(" ","").split(",");	//method chain 
		int i = (int) (Math.random() * noJam.length);
		System.out.println("1번 출력 : " + noJam[(int) (Math.random() * noJam.length)]);
	}// MathHomeWork

	/**
	 * 8자리의 영문자, 숫자로 구성된 임의의 비밀번호 반환
	 * 
	 * @return 8자리 비밀번호
	 */
	public static final int UPPER_CASE=0;	//constant
	public static final int LOWER_CASE=1;	//constant
	public static final int DECIMAL=2;		//constant
	
	
	public String printPassWord() {
		// 대문자(65-90)26자 소문자(97-122)26자 숫자(48-57)10자
		char[] secret = new char[8];
		int num=0;
//		for (int i = 0; i < secret.length; i++) {
//			
////			발생할 난수가 아니라면 else문을 타므로 더 많은 경우의 수가 발생해 덜 효율적 (14번 돈다)
////			num=(char) (Math.random()+122)+1;
////			if((num >47 && num < 58) || (num >64 && num <91) || (num >96 && num <123)){
////					secret[i]=(char)num;	
////			}else {
////				i--;
////			}
//			
//			//8번 돈다. 더 효율적임
//			switch ((int) (Math.random() * 3)) {
//			case 0:
//				secret[i] = (char) ((Math.random() * 26) + 65);// 대문자영어
//				break;
//			case 1:
//				secret[i] = (char) ((Math.random() * 26) + 97);// 소문자영어
//				break;
//			case 2:
//				secret[i] = (char) ((Math.random() * 10) + 48);// 숫자
////				break;
//			}// switch
//			
//			
//
//		} // for
		String passWordSet="0123456789wpqkfehrrkaRmxwonjWNAKFDPRMSOWMKKDFODWE*&^%$#!@#";	
			
		for(int i=0; i< secret.length; i++) {
			secret[i]=passWordSet.charAt((int)(Math.random()*passWordSet.length()));
		}//end for
		String passWord = new String(secret);
		return "2번 비밀번호 : " + passWord;
	}// printPassWord

	/**
	 * 3. 로또번호(1~45의 수 중 하나를 뽑고, 6자리 세트)구하여 반환하는 method를 작성하고 사용.<br>
	 * (중복값이 들어가면 안되고, 오름차순 정렬되어 출력)
	 * 
	 * @return
	 */
	public String printLotto() {
		int[] lottoList = new int[6];
//		int next = 0;
//		int num=0;
//		boolean duplication = false;
//		
//		do {
//			num = (int) (Math.random() * 45) + 1;
//			duplication = false;
//
//			// 중복 체크
//			for (int j = 0; j < lottoList.length; j++) {
//				if (lottoList[j] == num) {
//					duplication = true;
//					break;
//				} // if
//			} // for
//
//			// 중복이 없으면 추가
//			if (!duplication) {
//				lottoList[next] = num;
//				next++;
//			} // if
//		} while (next < lottoList.length);
		
//		int num=0;
		for(int i=0; i<lottoList.length; i++) {
			lottoList[i]=(int)(Math.random()*45)+1;
			for(int j=0; j < i; j++) {	//발생된 난수가 이전방에 존재하는지? 중복체크용 반복
				if(lottoList[i]==lottoList[j]) {	//현재방이 이전방과 같다면
					i--;	//현재방의 값을 다시 설정하기 위해 외부for의 인덱스를 ㅈ루이고
					break;	//안쪽for를 빠져 나간다.
				}//end if
			}//end for
		}//end for
		

		// 배열 정렬
		int temp = 0;
		for (int i = 0; i < lottoList.length; i++) {
			for (int j = i + 1; j < lottoList.length; j++) {
				if (lottoList[i] > lottoList[j]) {
					temp = lottoList[i];
					lottoList[i] = lottoList[j];
					lottoList[j] = temp;
				} // if
			} // for j
		} // for i

		// 배열정렬: 오름차순 
		String lotto = "";
		for (int i = 0; i < lottoList.length; i++) {
			lotto += " " + lottoList[i];
		}
		return "3번 로또번호 :" + lotto;
	}// printLotto

	public static void main(String[] args) {
		MathHomeWork mhw = new MathHomeWork();
		System.out.println(mhw.printPassWord());
		System.out.println(mhw.printLotto());
		
	}// main

}// class
