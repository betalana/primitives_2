public class Main {
    public static void main(String[] args) {

        int initialBalance = 400;
        int addedMoney = 1500;
        int bonus;
        if (addedMoney > 1000) {
            bonus = addedMoney / 100;
        } else {
            bonus = 0;
        }
        int summaryBalance = initialBalance + addedMoney + bonus;
        System.out.println((summaryBalance) + " руб. на счету, из них боснусных - " + (bonus) + " руб.");

    }
}