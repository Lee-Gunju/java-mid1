package nested.annoymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }




    public static void main(String[] args) {

        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) +1;
                System.out.println(randomValue);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}
