public class Main {
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the date
    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    // Setter for month
    public void setMonth(int m) {
        month = m;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for day
    public void setDay(int d) {
        day = d;
    }


    public int getDay() {
        return day;
    }


    public void setYear(int y) {
        year = y;
    }


    public int getYear() {
        return year;
    }


    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }


    public static void main(String[] args) {

        Date date = new Date(11, 11, 2004);


        date.displayDate();


        date.setMonth(12);
        date.setDay(25);
        date.setYear(2024);


        date.displayDate();
    }
}