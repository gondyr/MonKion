public class leapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = isLeapYear(year);
        System.out.println("Год " + year + (isLeapYear ? " является високосным." : " не является високосным."));
    }

    public static boolean isLeapYear(int year) {
            if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true; 
        }
        return false; 
    }
}
