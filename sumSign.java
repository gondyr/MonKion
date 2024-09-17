public class sumSign {
    public static void main(String[] args) {
        checkSumSign(-5, 1); // Вызываем метод с этими значениями
    }
    
    private static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }
    }
}
