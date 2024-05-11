package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = sc.nextLine();


        AuthGrade grades = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은   " + grades.getDescrition());




        System.out.println("==메뉴 목록==");

        if (grades.getLevel() > 0) {
            System.out.println("- 메인 화면"); }
        if (grades.getLevel() > 1) { System.out.println("- 이메일 관리 화면");
        }
        if (grades.getLevel() > 2) {
            System.out.println("- 관리자 화면"); }
    }
}
