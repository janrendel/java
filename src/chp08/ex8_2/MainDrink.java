package chp08.ex8_2;

public class MainDrink {
    public static void main(String[] args) {
        Drink drink = new Drink();
        Drink d1 = new Drink("물",500);
        Drink d2 = new Drink("콜라",1500);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(drink);
    }
}
