public class positiveNumb {
    public static void main(String[] args) {
        boolean result = isNegative(-1); // Пример вызова метода с отрицательным числом
        System.out.println(result ? "true" : "false");

    }

    private static boolean isNegative(int number) {
        return number < 0;
    }
}

