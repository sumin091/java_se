package main.kr.co.sist.module.login.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 로그인에 필요한 자격정보 저장
 */
public class Login {

    private String id;
    private String password;
    private String authRole; // ADMIN(관리자), NORMAL(일반)
    private List<Map<String, String>> userInfo;

    /**
     * Map으로 생성한 사용자 정보를 리스트에 입력
     */
    public Login() {

    }

    /**
     * 입력받은 사용자 정보를 저장한 맵 생성
     */
    public void setUserInfo(String id, String password, String authRole) {
    }

    public List<Map<String, String>> getUserInfo() {
        return userInfo;
    }
}
