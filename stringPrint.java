public class stringPrint {
            public static void main(String[] args) {
            printString("Строка № ", 10);
        }
    
        public static void printString(String str, int count) {
            for (int i = 0; i < count; i++) {
                System.out.println(str + (i+1));
            }
        }
       
}
