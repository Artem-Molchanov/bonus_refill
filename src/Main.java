public class Main {

    public static void main(String[] args) {

        int currentAccountSum = 100;
        int addCash = 1100;
        int bonus;

        if(addCash > 1000) {
            bonus = addCash / 100;
        } else {
            bonus = 0;
        }
        int totalSum = currentAccountSum + addCash + bonus;

        System.out.println("Итоговый счет: " + totalSum);
        System.out.println("в том числе, бонусных рублей: " + bonus);

    }

}
