public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}