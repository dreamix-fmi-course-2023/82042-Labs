import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.lang.Math;

public class FMIDate {
    private int year;
    private int month;
    private int day;

    FMIDate(int newDay, int newMonth, int newYear){
        setDay(newDay);
        setMonth(newMonth);
        setYear(newYear);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay){
        if(newDay >= 1 && newDay <= 31)
            this.day = newDay;
        else this.day = 1;
    }

    public void setMonth(int newMonth) {
        if(newMonth >= 1 && newMonth <= 12)
            this.month = newMonth;
        else this.month = 1;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public boolean isLeapYear(){
        boolean result = false;
        if((getYear() % 4 == 0) && (getYear() % 100 != 0 || getYear() % 400 == 0))
            result = true;
        return result;
    }

    public int getCentury(){
        return getYear() / 100 + 1;
    }

    long getDaysDifference(FMIDate other){
        LocalDate first = LocalDate.of(this.getYear(),this.getMonth(),this.getDay());
        LocalDate second = LocalDate.of(other.getYear(), other.getMonth(), other.getDay());
        return Math.abs(ChronoUnit.DAYS.between(first,second)) + 1;
    }

    @Override
    public String toString() {
        String result = getYear() + " " + getMonth() + " " + getMonth() + " " + getDay() + " - " + getCentury() + ". century ";
        if(isLeapYear() == true) result += "This is a LEAP year!";
        return result;
    }
}
