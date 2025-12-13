public enum Practice1 {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean weekday;

    Practice1(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean isWeekday() {
        return weekday;
    }

    public static void main(String[] args) {
            Practice1 day = Practice1.WEDNESDAY;

            if (day.isWeekday()) {
                System.out.println(day + " - будний");
            } else {
                System.out.println(day + " - выходной");
            }
    }
}
