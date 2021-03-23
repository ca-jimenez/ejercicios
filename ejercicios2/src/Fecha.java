import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar date;

    public Fecha(int day, int month, int year) {

        date = new GregorianCalendar(year, month - 1, day);
    }

    public Fecha() {
        date = new GregorianCalendar();
    }

    public void addOneDay() {
        date.add(GregorianCalendar.DATE, 1);
    }

    public Date getDate() {
        return date.getTime();
    }

    @Override
    public String toString() {
        int day = date.get(GregorianCalendar.DAY_OF_MONTH);
        int month = date.get(GregorianCalendar.MONTH) + 1;
        int year = date.get(GregorianCalendar.YEAR);
        return (day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year;
    }

    public int getDay() {
        return date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getMonth() {
        return date.get(GregorianCalendar.MONTH) + 1;
    }

    public int getYear() {
        return date.get(GregorianCalendar.YEAR);
    }

    public void setDay(int day) {
        date.set(GregorianCalendar.DAY_OF_MONTH, day);
    }

    public void setMonth(int month) {
        date.set(GregorianCalendar.MONTH, month - 1);
    }

    public void setYear(int year) {
        date.set(GregorianCalendar.YEAR, year);
    }

    public boolean isCurrentDate() {
        GregorianCalendar now = new GregorianCalendar();

        return date.get(GregorianCalendar.YEAR) == now.get(GregorianCalendar.YEAR)
                && date.get(GregorianCalendar.MONTH) == now.get(GregorianCalendar.MONTH)
                && date.get(GregorianCalendar.DAY_OF_MONTH) == now.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
