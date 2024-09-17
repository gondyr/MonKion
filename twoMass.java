public class twoMass {
    public static void main(String[] args) {
        int n = 5; // ВВодим размер массива
        int[][] matrix = new int[n][n]; // Создаём квадратный двумерный массив

        // Заполняем диагональные элементы единицами
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1; // Элементы главной диагонали
        }
    }
}

