package codewars.com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.stream.IntStream;

public class UnluckyDays {
    public int unluckyDays(int year) {
        return (int) IntStream.rangeClosed(0, 11)
                .mapToObj(x -> new Calendar.Builder().setDate(year, x, 13).build())
                .filter(x -> x.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
                .count();
    }

    public int unluckyDaysLD(int year) {
        return (int) IntStream.rangeClosed(1, 12)
                .mapToObj(x -> LocalDate.of(year, x, 13))
                .filter(x -> x.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .count();
    }
}
