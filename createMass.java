public class createMass {
    public static void main(String[] args) {
        // Пример вызова метода
        createArray(5, 10);
    }

    // Метод, создающий и заполняющий массив
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len]; // Создаём массив указанной длины

        // Заполняем массив значением initialValue
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array; // Возвращаем заполненный массив
    }
}

