public class FMIDateTest {
    public static void main(String[] args) {
        FMIDate date1 = new FMIDate(26,9,2016);
        FMIDate date2 = new FMIDate(3,3,1878);

        FMIDate date3 = new FMIDate(26,9,2016);
        FMIDate date4 = new FMIDate(1,1,2017);

        System.out.println(date1.getDaysDifference(date2));
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date3.getDaysDifference(date4));
        System.out.println(date3);
        System.out.println(date4);
    }
}
