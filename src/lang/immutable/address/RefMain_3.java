package lang.immutable.address;

public class RefMain_3 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스터스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getValue());
        System.out.println(b.getValue());

        change(b,"부산");
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getValue());
        System.out.println(b.getValue());





    }

    private static void change (Address address, String changeAddress){
        System.out.println("주소 값 변경" + changeAddress);
        address.setValue(changeAddress);
    }
}
