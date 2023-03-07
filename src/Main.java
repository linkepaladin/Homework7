public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        int salary = 15000;
        int total = 0;
        int month = 0;
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
        System.out.println();
    }
    public static void task3() {
        int people = 12_000_000;
        int death = 8 * 12000;
        int life = 17 * 12000;
        int year = 0;
        while (year < 10) {
            year++;
            people = people + (life - death);
            System.out.println("Год " + year + " численность населения составляет " + people);
        }
    }
}