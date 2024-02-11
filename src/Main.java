public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int investition = 15000;
        int result = 2459000;
        int total = 0;
        int month = 0;
        while (total < result) {
            month++;
            total = total + investition;
        }
        System.out.println("Месяц" + month + "сумма накоплений равна" + total + "рублей");
        System.out.println("Exercise 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println("Exercise 3");
        int population = 12000000;
        int differencePopulation = population / 1000;
        int reftility = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (differencePopulation * (reftility - dead));
            System.out.println("Год " + year + ", численность населения состовляет " + population + " человек");
        }
        System.out.println("Exercise 4");
        double money = 15000;
        double percent = 7 / 100f;
        int all = 12000000;
        month = 0;
        while (money < all) {
            month++;
            money = money + money * percent;
            System.out.println("месяц " + month + " сумма накоплений равна " + money + " рублей");
        }
        System.out.println("Exercise 5");
        money = 15000;
        month = 0;
        int period = 6;
        while (money < all) {
            month++;
            money = money + money * percent;
            if (month % period == 0) {
                System.out.println("месяц " + month + " сумма накоплений равна " + money + " рублей");
            }
        }
        System.out.println("Exercise 6");
        money = 15000;
        int time = 9 * 12;
        for (int i = 0; i < time; i++) {
            money = money + money * percent;
            if (i % period == 0) {
                System.out.println("месяц " + i + " сумма накоплений равна " + money + " рублей");
            }
        }
        System.out.println("Exercise 7");
        for (int i=1;i<31;i+=7) {
            System.out.println("Сегодня пятница " +i+"-е число. Необходимо подготовить отчет");
        }
        System.out.println("Exercise 8");
        int nextYear = 2025;
        for (int year = 0; year < nextYear + 100; year += 79) {
            if (year > nextYear - 200) {
                System.out.println(year);
            }
        }
    }
}


