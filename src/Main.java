public class Main {
    public static void main(String[] args) {System.out.println("Exercise 1");
    int investition = 15000;
    int total = 0;
    int i = 0;
    while (total < 2459000){
        i++;
        total=total+investition;
    } System.out.println("Месяц"+i+"сумма накоплений равна"+total+"рублей");
    System.out.println("Exercise 2");
        int a=0;
        while (a<10){
            a++;
            System.out.print(a+" ");
        }
        System.out.println();
        for (a=10;a>0;a--){
        System.out.print(a+" ");}
        System.out.println("Exercise 3");
        int differencePopulation = 12000000/1000;
        int population =12000000;
        int reftility = 17;
        int dead =8;
        for (int year = 1; year <=10; year++){
            population=population+(differencePopulation*(reftility-dead));
            System.out.println("Год "+year+", численность населения состовляет "+population+" человек");}
        System.out.println("Exercise 4");
        int percent =(15000*7)/100;
        int monTh = 0;
        while (total<12000000){
            monTh++;
            investition=investition+percent;
            total=total+investition;
            if (monTh %5==0){System.out.println("месяц "+monTh+" сумма накоплений равна "+total+" рублей");}}
        System.out.println("Exercise 5");
        int salary =15000;
        int toTal =0;
        int month =0;
        while (month<36){
            month++;
            toTal=toTal+salary;
            if (month %6==0){
                System.out.println("Месяц"+month+"сумма накоплений равна"+toTal+"рублей");}
            System.out.println("Exercise 6");
                investition = 15000;
                total = 0;
                i = 0;
                while (i<108){
                    i++;
                    total=total+investition;
                    if (i %6==0){
                        System.out.println("Месяц"+i+"сумма накоплений равна"+total+"рублей");}
    }
            System.out.println("Exercise 7");
                for (int day =1;day<31;day++){
                    if (day %7==0){
                        System.out.println("Сегодня пятница"+day+"-е число. Необходимо подготовить отчет");
                    }
                }
            System.out.println("Exercise 8");
            int nextYear = 2024;
            for (int year = 0; i < nextYear + 100; i += 79) {
                if (i > nextYear - 200) {
                    System.out.println(i);
                }

        }}}}