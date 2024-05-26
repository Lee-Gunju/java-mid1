package exception.ex4;



import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();


        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자:");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }

    // 공동 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다." + e);
        System.out.println("==개발자용 디버깅 메시지 ==");
        e.printStackTrace(System.out);
        //e.printStackTrace();

        if (e instanceof SendExceptionV4 sendEx){
            System.out.println("전송오류, 전송 데이타: +_" + sendEx.getSendData());

        }

    }
}
