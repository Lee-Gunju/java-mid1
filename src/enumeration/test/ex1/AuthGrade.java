package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    private final int level;
    private final String descrition;


    AuthGrade(int level, String descrition) {
        this.level = level;
        this.descrition = descrition;
    }

    public int getLevel() {
        return level;
    }

    public String getDescrition() {
        return descrition;
    }
}
