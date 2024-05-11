package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 3);

        System.out.println("1. 단순 tostring 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. printLn 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. object 다형성 활용");
        ObjectPrint.print(car);
        ObjectPrint.print(dog1);
        ObjectPrint.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue  " + refValue);

    }

}
