public class numberStatus {
    public static void main(String[] args) {
        determineNumberType(0); // Вызов класса
    }

    private static void determineNumberType(int number) { // Cоздание метода и инициализация переменной number
        if (number >= 0) {
            System.out.println("Positive number.");
                } else {
            System.out.println("Negative number.");
        }
    }
}

