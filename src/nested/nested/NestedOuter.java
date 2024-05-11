package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 4;

    static class Nested{
        private int nestedInstanceValue = 5;

        public void print() {
            // 자신의 맴버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클랴스의 인스턴스 맴버에 접근에는 접근 안됨
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 맴버에는 접근 O, private 접근 가능
            System.out.println(outClassValue);
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
