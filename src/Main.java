public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            i++;
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i+" ");
            i++;}
        System.out.println();
        for (i = 10;i >=1;i--){
            System.out.print(i+" ");}
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12000000;
        int futureYears = 0;
        while (futureYears < 10){
            futureYears++;
            population += population / 1000 * 9;
            System.out.println("Год "+futureYears+" численность населения составит "+population);}
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double salary = 15000;
        float bankRate = 0.07f;
        int month = 1;
        while (salary <= 12_000_000) {
            salary += salary * bankRate;
            System.out.println("Месяц " + month + " сумма накоплений равна " + salary);
            month++;
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double salary = 15000;
        float bankRate = 0.07f;
        int month = 0;
        while (salary <= 12_000_000) {
            month++;
            salary += salary * bankRate;
            if(month%6==0){
                System.out.println("Месяц " + month + " сумма накоплений равна " + salary);}
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int salary = 15000;
        int month = 9*12;
        for (int i = 1; i <= month ;++i) {
            salary *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + salary);
            }
        }
        System.out.println("За 9 лет сумма накоплений составит " + salary);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int i = 2;
        for (; i < 31 ; i = i + 7) {
            System.out.println("Сегодня пятница " +i+ "-е чило. Необходимо подготовить отсчет.");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int yearAgo = currentYear - 200;
        int yearAfter = currentYear + 100;
        for (int i = yearAgo;i <= yearAfter ; ++i) {
            if(i % 79 == 0) {
                System.out.println(i);}
        }
    }
}