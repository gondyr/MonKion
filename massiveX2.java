public class massiveX2 {
    public static void main(String[] args) {
        // Создание массива
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проходим по массиву и умножаем числа меньше 6 на 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2; // Умножаем на 2
            }
        }
    }
}
