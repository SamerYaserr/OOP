import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<WeekDays> days = EnumSet.of(WeekDays.MONDAY);
        System.out.println(days);

        days = EnumSet.of(WeekDays.MONDAY, WeekDays.FRIDAY);
        System.out.println(days);

        days = EnumSet.of(WeekDays.MONDAY, WeekDays.MONDAY);
        System.out.println(days);

        days = EnumSet.allOf(WeekDays.class);
        System.out.println(days);

        days = EnumSet.range(WeekDays.WEDNESDAY, WeekDays.SATURDAY);
        System.out.println(days);

        days = EnumSet.noneOf(WeekDays.class);
        System.out.println(days);

        days.add(WeekDays.FRIDAY);
        days.add(WeekDays.THURSDAY);
        System.out.println(days);

        EnumSet<WeekDays> days2 = EnumSet.of(WeekDays.WEDNESDAY, WeekDays.SATURDAY);
        days.addAll(days2);
        System.out.println(days);

        days.remove(WeekDays.SATURDAY);
        System.out.println(days);

        days.removeAll(days2);
        System.out.println(days);
    }
}