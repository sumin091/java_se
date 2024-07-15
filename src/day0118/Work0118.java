package day0118;

import java.util.Arrays;
import java.util.Random;

public class Work0118 {

//	1. 아래의 데이터로 배열을 만들고, 임의의 방하나의 값을 출력.
//	   “어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬~,못때리쥬~,개킹받쥬~”
	public void printMz() {

		String[] mzWordarr = { "어쩔티비", "저쩔티비", "뇌절티비", "안물티비", "안궁티비", "때리고싶쥬~", "못때리쥬~", "개킹받쥬~" };

		// 임의의 배열 값 출력하기
		String randomWord = getrandomWord(mzWordarr);
		System.out.println(randomWord);
	}// printMz

	// 임의의 배열 값 반환하는 메소드
	private static String getrandomWord(String[] mzWordarr) {
		Random random = new Random();
		int randomIndex = random.nextInt(mzWordarr.length);
		return mzWordarr[randomIndex];
	}

//	2. 8자리의 영문자,숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 
//	  method를 작성하여 사용(출력).

	private static String generatePw() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder password = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			int randomIndex = random.nextInt(characters.length());
			password.append(characters.charAt(randomIndex));
		}

		return password.toString();
	}

//	3. 로또번호(1~45의  수 중 하나를 뽑고, 6자리 세트) 구하여  반환하는 method를 
//	   작성하고 사용. ( 중복값이 들어가면 안되고, 오름차순 정렬되어 출력되어야 한다.)

	private static int[] generateNum() {
		int[] lottoNumbers = new int[6];
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			int newNumber;
			do {
				newNumber = random.nextInt(45) + 1;
			} while (containsNumber(lottoNumbers, newNumber));

			lottoNumbers[i] = newNumber;
		}

		// 정렬
		Arrays.sort(lottoNumbers);

		return lottoNumbers;
	}// generateNum

	// 배열에 숫자가 포함되어 있는지 확인하는 메서드
	private static boolean containsNumber(int[] array, int number) {
		for (int value : array) {
			if (value == number) {
				return true;
			}
		}
		return false;
	}// containsNumber

	public static void main(String[] args) {
		String[] mzWordarr = { "어쩔티비", "저쩔티비", "뇌절티비", "안물티비", "안궁티비", "때리고싶쥬~", "못때리쥬~", "개킹받쥬~" };

		// 임의의 배열값 출력하기
		String randomWord = getrandomWord(mzWordarr);
		System.out.println(randomWord);

		// 임의의 비밀번호 출력하기
		String generatedPassword = generatePw();
		System.out.println("임의의 비밀번호: " + generatedPassword);

		// 로또 번호 출력하기
		int[] lottoNumbers = generateNum();
		System.out.println("자동생성된 로또번호: " + Arrays.toString(lottoNumbers));
	}// main

}// class
