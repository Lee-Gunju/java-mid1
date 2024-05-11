package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    public void setYear(int year) {
//        this.year = year;
//    }
//    public void setMonth(int month) {
//        this.month = month;
//    }
//    public void setDay(int day) {
//        this.day = day;}


    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

