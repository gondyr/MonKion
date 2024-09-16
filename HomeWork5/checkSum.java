public class checkSum {
        public static void main(String[] args) {
        boolean result = isSumInRange(100, 8); // Пример вызова метода с конкретными значениями
        System.out.println(result ? "true" : "false");
    }

    private static boolean isSumInRange(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }
}

