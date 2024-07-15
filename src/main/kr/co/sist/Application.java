package main.kr.co.sist;

import javax.swing.*;

import main.kr.co.sist.view.logAnalysis.LogAnalyzerView;
import main.kr.co.sist.view.login.LoginView;

/**
 * Application을 실행하는 메인 메서드를 포함하는 클래스
 *
 */
public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginView::new);
        SwingUtilities.invokeLater(LogAnalyzerView::new);
    }
}
