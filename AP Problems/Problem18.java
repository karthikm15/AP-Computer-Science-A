1) a)

public static int numberofLeapYears(int year1, int year2) {
    int count = 0;
    for (int i = year1; i < year2 + 1; i++) {
        if (isLeapYear(i)) {
            count++;
        }
    }
    return count;
}

b)
public static int dayofWeek (int month, int day, int year) {
    return (firstDayOfYear(year) + dayOfYear(month, day, year) % 7)-1;
}

