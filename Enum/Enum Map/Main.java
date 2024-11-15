import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumMap<WeekDays, String> dayMap = new EnumMap<>(WeekDays.class);
        dayMap.put(WeekDays.MONDAY, "Working day");
        dayMap.put(WeekDays.FRIDAY, "Day off");
        System.out.println(dayMap);

        EnumMap<WeekDays, String> dayMap2 = new EnumMap<>(WeekDays.class);
        dayMap2.putAll(dayMap);
        System.out.println(dayMap2);
    }
}