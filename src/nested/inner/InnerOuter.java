package nested.inner;

public class InnerOuter {

    private static int outClassValue =3;
    private int outInstanceValue =4;

    class Inner {
        private int innerInstanceValue =5;

        public void print() {
            System.out.println(innerInstanceValue);


            System.out.println(outInstanceValue);
            System.out.println(outClassValue);
        }
    }
}
