package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String str = object.toString();

        //toString() 반환
        System.out.println(str);

        //오브젝트 직접 출력
        System.out.println(object);
    }
}
