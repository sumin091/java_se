package day0119;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Work0119 {

	public String fileName;
	public String backupName;
	public String csvData;

	public String fileName(String fileName) {
		int dotCheck = fileName.lastIndexOf('.');

		String noDot;
		String fileExtension;

		if (dotCheck != -1) {
			noDot = fileName.substring(0, dotCheck);
			fileExtension = fileName.substring(dotCheck);
		} else {
			noDot = fileName;
		}

		return backupFileName();

	}// FileName

	public String backupFileName() {
		if (backupName.isEmpty()) {
			String fn = backupName.concat("_bak");
		}

		return backupFileName();
	}// backupFileName

	public String[] printArray(String csvData) {
		// csvData=“고한별,김도원,김동섭.김무영~김현종 박시현,손지민,김병년.김일신”;
		String[] csvDataArray = csvData.split("[,.~]+");

		for (int i = 0; i < csvDataArray.length; i++) {
			csvDataArray[i] = removekim(csvDataArray[i]);
		}
		return csvDataArray;
	}// printArray

	private String removekim(String fullName) {

		if (fullName.startsWith("김")) {
			return fullName.substring(1);
		} else {
			return fullName;
		}
	}// removekim

	public String printWeather(int num, String weather) {

		// SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss
		// EEEE")
		if (num == 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.KOREA);
		} else if (num == 1) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.US);
		} else if (num == 2) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.JAPAN);
		} else if (num == 3) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.CANADA);
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.KOREA);
		}

		return weather;
	}

	public static void main(String[] args) {
		String csvData = "고한별,김도원,김동섭.김무영~김현종 박시현,손지민,김병년.김일신";
		//String[] csvDataArray = removekim(csvData);

		// 결과 출력
		System.out.println("csvData 호출:");
		//for (String name : csvDataArray) {
//			System.out.println(name);
		}

	}




