package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택영역이 종룓되는 순간 함께 종료된다.

        class LocalPrinter implements Printer{
            int value = 0;


            public void printData() {

            }

            @Override
            public void print() {
                System.out.println(value);
                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }

        }

        LocalPrinter localPrinter = new LocalPrinter();
        //localPrinter.print();
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(1);
        printer.print();
        System.out.println(localOuterV1);
        System.out.println(printer);

        // 추가
        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
