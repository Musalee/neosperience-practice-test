public class Main {
    public static void main(String[] args) {

        // Test della classe
        var s = new Student("Samuele", "Questa", "09/07/2004", "9,8,7,8,7");

        // Expected output: 19
        System.out.println(s.age());

        // Expected output: 7.8
        System.out.println(s.avg_grade());
    }
}