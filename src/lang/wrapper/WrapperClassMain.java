package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer intobj = Integer.valueOf(10);
        Long longobj = new Long(10);


        System.out.println(newInteger);
        System.out.println(longobj);

        int intvalue = intobj.intValue();
        System.out.println(intvalue);
        long longvalue = longobj.longValue();
        System.out.println(longvalue);


        System.out.println(newInteger == intobj);
        System.out.println(newInteger.equals(intobj));
    }
}
