public class pColor {
    public static void main(String[] args) {
        printMe(1000); // Вызов метода
        }

    private static void printMe (int value) {
        if ( value <= 0) {  // если переменная меньше или равна 0
            System.out.println("Красный");   
        }
        else if ( value <=100 ) { // если переменная меньше или равна 100
            System.out.println("Жёлтый");
        }
        else {System.out.println("Зелённый");} // для остальных значений
    }
}
