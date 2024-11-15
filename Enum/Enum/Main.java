public class Main {
    public static void main(String[] args) {
        System.out.println(WeekDays.MONDAY.getStatus());
        System.out.println(WeekDays.FRIDAY.getStatus());

        WeekDays.MONDAY.setStatus("Day off too");
        System.out.println(WeekDays.MONDAY.getStatus());
        System.out.println(WeekDays.FRIDAY.getStatus());
    }
}