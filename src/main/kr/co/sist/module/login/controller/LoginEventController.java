package main.kr.co.sist.module.login.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import main.kr.co.sist.view.login.LoginView;

/**
 * 로그인의 view와 controller 연결
 */
public class LoginEventController extends WindowAdapter implements ActionListener {
    private LoginView loginView;
    public static String inputId,inputPassword;

    public LoginEventController(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // 로그인 버튼 클릭시 id와 password 값을 변수에 저장

        // 종료 버튼 누르면 창 닫기
        if (ae.getSource()==loginView.getExitButton()){
            loginView.dispose();
        }
    }

    @Override
    public void windowClosing(WindowEvent we) {
        loginView.dispose();
    }

    public String getInputId() {
        return inputId;
    }

    public String getInputPassword() {
        return inputPassword;
    }
}
