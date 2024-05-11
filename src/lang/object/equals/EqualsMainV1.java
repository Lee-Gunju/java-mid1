package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userv1 = new UserV1("id-100");
        UserV1 userv2 = new UserV1("id-100");

        System.out.println("identity = " + (userv1 == userv2));
        System.out.println("equals() = " + (userv1.equals(userv2)));


    }
}
