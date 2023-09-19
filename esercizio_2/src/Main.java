public class Main {
    public static void main(String[] args) {
        var s = new Student("Samuele", "Questa", "09/07/2004", "9,8,7,8,7");
        System.out.println(s.age());
        System.out.println(s.avg_grade());
    }
}