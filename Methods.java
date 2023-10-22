import java.util.Arrays;

public class Methods {
    public static void categories() {
        String[] categories = {"1.All", "2.Carry-out", "3.Burgers", "4.Sushi", "5.Pizza", "6.Pasta", "7.Breakfasts", "8.Lunch", "9.Georgia", "10.Italy", "11.More"};
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
        }
    }

    public static void more() {
        String[] more = {"1.Russian", "2.Uzbek", "3.Asia", "4.Japan", "5.China", "6.Coffee", "7.Desserts"};
    }

    public static void carryout() {
        String[] carryout = {"Wok", "Yapona Mama", "Street 77", "Maurice"};
        int counter = 0;
        for (int i = 0; i < carryout.length; i++) {
            counter++;
            System.out.println(counter + "." + carryout[i]);
        }
    }

    public static void burgers() {
        String[] burgers = {"Street 77","Feed up","Les Ailes","Wendy's","Black Star Burger"};
        int counter = 0;
        for (int i = 0; i < burgers.length; i++) {
            counter++;
            System.out.println(counter + "." + burgers[i]);
        }
    }

    public static void sushi() {
        String[] sushi = {"Yapona Mama","Sushi Wok Master","SushiMoscow","Tokyobae"};
        int counter = 0;
        for (int i = 0; i < sushi.length; i++) {
            counter++;
            System.out.println(counter + "." + sushi[i]);
        }
    }

    public static void pizza() {
        String[] pizza = {"Street 77","Chopar Pizza","Moscowpizza"};
        int counter = 0;
        for (int i = 0; i < pizza.length; i++) {
            counter++;
            System.out.println(counter + "." + pizza[i]);
        }
    }
}
