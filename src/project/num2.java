package project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class num2 {

	    // 파일을 읽어들여 Map에 저장하는 메서드
	    private static Map<String, String> readFileToMap(String filename) throws IOException {
	        Map<String, String> fileContentMap = new HashMap<>();
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	        
	        String line ;
	        
	        int i = 0;
	        while ((line = reader.readLine()) != null) {
	            // 각 줄을 ':'을 기준으로 key-value 쌍으로 변환하여 Map에 추가
	            String[] parts = line.split("\\]\\[");
	           
	            if (parts.length >= 4) { // 적어도 4개의 요소가 있어야 함 (0부터 시작하므로 3)
	                String key = String.valueOf(i);
	                String value = parts[2].trim(); // 4번째 요소를 값으로 사용
	                fileContentMap.put(key, value);
	                i++;
	            }
	        }

	        reader.close();
	        return fileContentMap;
	    }

	    
		public static void getBrInfo(Map<String, String> map) {
			int ieCnt = 0;
			int chCnt = 0;
			int opCnt = 0;
			int ffCnt = 0;
			int sfCnt = 0;
			int totalCnt=0;
			
			for (String entry : map.values()) {
//				System.out.println(entry);

				if (entry != null) {
					// 브라우저 정보가 있는 경우만 처리
					if (entry.equals("ie")) {
						entry = "ie";
						ieCnt++;
					} else if(entry.equals("Chrome")){
						entry = "Chrome";
						chCnt++;

					}else if(entry.equals("firefox")){
						entry = "firefox";
						ffCnt++;
					}else if(entry.equals("Safari")){
						entry = "Safari";
						sfCnt++;
					}else if(entry.equals("opera")){
						entry = "opera";
						opCnt++;

					}


				}//end if
			}//end for
			
			
			totalCnt = ieCnt+chCnt+opCnt+ffCnt+sfCnt;
			
			double iePercent= (double)ieCnt / (double)totalCnt * 100;
			double chPercent= (double)chCnt / (double) totalCnt * 100;
			double opPercent= (double)opCnt / (double) totalCnt * 100;
			double ffPercent= (double)ffCnt / (double) totalCnt * 100;
			double sfPercent= (double)sfCnt / (double) totalCnt * 100;

			System.out.println("인터넷익스플로어 횟수: "+ieCnt);
			System.out.println("크롬 횟수: "+chCnt);
			System.out.println("오페라 횟수: "+opCnt);
			System.out.println("파이어폭스 횟수: "+ffCnt);
			System.out.println("사파리 횟수: "+sfCnt);
			
			System.out.println("인터넷익스플로어 비율: "+(int)iePercent+"%");
			System.out.println("크롬 비율: "+(int)chPercent+"%");
			System.out.println("오페라 비율: "+(int)opPercent+"%");
			System.out.println("파이어폭스 비율: "+(int)ffPercent+"%");
			System.out.println("사파리 비율: "+(int)sfPercent+"%");
			
			
			
		}
	    
	    
	    public static void main(String[] args) {
	    	String filename = "C:/Users/user/Desktop/6.조별과제/sist_input_1.log"; // 파일 이름
	    	
	    	try {
	    		Map<String, String> fileContentMap = readFileToMap(filename);
	    		getBrInfo(fileContentMap);
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	}