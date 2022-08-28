import java.util.GregorianCalendar;

public class Lab04_2 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+ calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+ (calendar.get(GregorianCalendar.MONTH)+1));
        System.out.println("Date is "+ calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+ calendar.get(GregorianCalendar.DAY_OF_WEEK));
        
        calendar.setTimeInMillis(calendar.getTimeInMillis()+3600000*24);
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is "+ calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+ (calendar.get(GregorianCalendar.MONTH)+1));
        System.out.println("Date is "+ calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+ calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calendar.getTime());
    }
}