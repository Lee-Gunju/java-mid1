package lang.wrapper;

public class WrapperVSPrimitive {

    public static void main(String[] args) {
        int interations = 1_000_000_000; // 10억
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < interations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("Sum of primitive values: " + sumPrimitive);
        System.out.println(endTime - startTime);


        // wrapper class long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < interations; i++) {
            sumWrapper += i; // 오토 박싱 발생
            }
            endTime = System.currentTimeMillis();
            System.out.println("sumWrapper = " + sumWrapper);
            System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");


        }
    }

