import java.util.Calendar;
import java.util.GregorianCalendar;
public class Chap2P7 {
	public static void main(String[] args) {
    	GregorianCalendar cal = new GregorianCalendar(2019, Calendar.OCTOBER, 11);
    	GregorianCalendar myBirthday = new GregorianCalendar(2004, Calendar.SEPTEMBER, 4);
    	cal.add(Calendar.DAY_OF_MONTH, 100);
    	
    	int day = cal.get(Calendar.DAY_OF_MONTH);
    	int month = cal.get(Calendar.MONTH);
    	month++;
    	System.out.println(month);
    	int weekday2 = cal.get(Calendar.DAY_OF_WEEK);
    	int year = cal.get(Calendar.YEAR);
    	int weekday3 = myBirthday.get(Calendar.DAY_OF_WEEK);
    	String name = "";
    	String name2 = "";
    	weekday2 = (weekday2 + (100 % 7)) % 7;
    	if (weekday2 == 1) {
         	name = "Sunday";
    	}
    	if (weekday2 == 2) {
         	name = "Monday";
    	}
    	if (weekday2 == 3) {
         	name = "Tuesday";
    	}
    	if (weekday2 == 4) {
         	name = "Wednesday";
    	}
    	if (weekday2 == 5) {
         	name = "Thursday";
    	}
    	if (weekday2 == 6) {
         	name = "Friday";
    	}
    	if (weekday2 == 7) {
         	name = "Saturday";
    	}
    	
    	if (month == 1) {
         	name2 = "January";
    	}
    	if (month == 2) {
         	name2 = "February";
    	}
    	if (month == 3) {
         	name2 = "March";
    	}
    	if (month == 4) {
         	name2 = "April";
    	}
    	if (month == 5) {
         	name2 = "May";
    	}
    	if (month == 6) {
        	name2 = "June";
    	}
    	if (month == 7) {
         	name2 = "July";
    	}
    	if (month == 8) {
         	name2 = "August";
    	}
    	if (month == 9) {
         	name2 = "September";
    	}
    	if (month == 10) {
         	name2 = "October";
    	}
    	if (month == 11) {
         	name2 = "November";
    	}
    	if (month == 12) {
         	name2 = "December";
    	}
    	
    	System.out.print("The date 100 days from now will be ");
    	System.out.print(name);
    	System.out.print(" , ");
    	System.out.print(name2);
    	System.out.print(" ");
    	System.out.print(day);
    	System.out.print(", ");
    	System.out.println(year);
    	
    	if (weekday3 == 1) {
         	name = "Sunday";
    	}
    	if (weekday3 == 2) {
         	name = "Monday";
    	}
    	if (weekday3 == 3) {
         	name = "Tuesday";
    	}
    	if (weekday3 == 4) {
         	name = "Wednesday";
    	}
    	if (weekday3 == 5) {
         	name = "Thursday";
    	}
    	if (weekday3 == 6) {
         	name = "Friday";
    	}
    	if (weekday3 == 7) {
         	name = "Saturday";
    	}
    	System.out.print("The weekday of my birthday is ");
    	System.out.println (name);
    	
    	myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
    	int month1 = myBirthday.get(Calendar.MONTH);
    	int day1 = myBirthday.get(Calendar.DAY_OF_MONTH);
    	int weekday4 = myBirthday.get(Calendar.DAY_OF_WEEK);
    	int year1 = myBirthday.get(Calendar.YEAR);
    	
    	if (weekday4 == 1) {
         	name = "Sunday";
    	}
    	if (weekday4 == 2) {
         	name = "Monday";
    	}
    	if (weekday4 == 3) {
         	name = "Tuesday";
    	}
    	if (weekday4 == 4) {
         	name = "Wednesday";
    	}
    	if (weekday4 == 5) {
         	name = "Thursday";
    	}
    	if (weekday4 == 6) {
         	name = "Friday";
    	}
    	if (weekday4 == 7) {
         	name = "Saturday";
    	}
    	
    	if (month1 == 1) {
         	name2 = "January";
    	}
    	if (month1 == 2) {
         	name2 = "February";
    	}
    	if (month1 == 3) {
         	name2 = "March";
    	}
    	if (month1 == 4) {
         	name2 = "April";
    	}
    	if (month1 == 5) {
         	name2 = "May";
    	}
    	if (month1 == 6) {
        	name2 = "June";
    	}
    	if (month1 == 7) {
         	name2 = "July";
    	}
    	if (month1 == 8) {
         	name2 = "August";
    	}
    	if (month1 == 9) {
         	name2 = "September";
    	}
    	if (month1 == 10) {
         	name2 = "October";
    	}
    	if (month1 == 11) {
         	name2 = "November";
    	}
    	if (month1 == 12) {
         	name2 = "December";
    	}
    	
    	System.out.print("The date 10000 days from my birthday will be ");
    	System.out.print(name);
    	System.out.print(" , ");
    	System.out.print(name2);
    	System.out.print(" ");
    	System.out.print(day1);
    	System.out.print(", ");
    	System.out.println(year1);
	}
}
