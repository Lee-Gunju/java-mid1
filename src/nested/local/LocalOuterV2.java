package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;


            public void printData() {

            }

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }

        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(1);
        System.out.println(localOuterV1);
    }
}
