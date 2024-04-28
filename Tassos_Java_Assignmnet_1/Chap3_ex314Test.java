public class Chap3_ex314Test {

    public static void main(String[] args) {
        Chap3_ex314 thisDate = new Chap3_ex314(10, 10, 2024);

        int day = thisDate.getDay();
        int month = thisDate.getMonth();
        int year = thisDate.getYear();

        System.out.println("Date:" + day + "." + month + "." + year);

        thisDate.setDay(10);
        thisDate.setMonth(12);
        thisDate.setYear(2027);

        thisDate.displayDate();

    }
}