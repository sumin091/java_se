package main.kr.co.sist.module.login.controller;

import javax.swing.*;

import main.kr.co.sist.module.login.vo.Login;
import main.kr.co.sist.util.Validation;
import main.kr.co.sist.view.logAnalysis.LogAnalyzerView;
import main.kr.co.sist.view.login.LoginView;

import java.util.List;
import java.util.Map;

/**
 * login 기능을 전담할 controller
 */
public class LoginController {
    private String id,password;
    private LoginEventController loginEventController;

    /**
     * id와 password를 입력받은 정보로 저장
     */

    /**
     * 기능 1 : 유효성 검사<br>
     * 설명 : 아이디와 비밀번호 값이 입력되어 있는지 확인한다.
     */

    /**
     * 기능 2 : 비밀번호 일치 여부 확인<br>
     * 설명1 : 입력된 아이디와 비밀번호가 vo와 일치하는지 확인한다.<br>
     * 설명2 : (입력된 아이디, 비밀번호) 비교 (목록으로 갖고 있는 데이터 리스트 userInfo)<br>
     *  userInfo Type => List<Map<String, String>>, User Type => Map<String, String>
     *
     * 결과 : 일치하는 데이터가 있으면 true 리턴, 아니면 false 리턴
     */

    /**
     * 기능 3 : 로그인 버튼 클릭 이벤트<br>
     * 설명 : 로그인 버튼 클릭 시, 로그인 정보와 일치하면 메인화면으로 이동하고<br>
     *       비밀번호가 일치하지 않으면 확인을 위한 알림창을 출력한다.
     */

}
