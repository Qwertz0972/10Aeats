import java.util.Arrays;
import java.util.HashSet;

public class Methods {
    public static void categories() {
        String[] categories = {"1.All", "2.Carry-out", "3.Burgers", "4.Sushi", "5.Pizza", "6.Pasta", "7.Breakfasts", "8.Lunch", "9.Georgia", "10.Italy", "11.More"};
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
        }
    }

    public static void more() {
        String[] more = {"1.Russian", "2.Uzbek", "3.Asia", "4.Japan", "5.Coffee", "6.Desserts","0.Back"};
        for (int i = 0; i < more.length; i++) {
            System.out.println(more[i]);
        }
    }

    public static void All(){
        String[] All = {"Wok", "Yapona Mama", "Street 77", "Maurice","Feed up","Les Ailes","Wendy's","Black Star Burger","Sushi Wok Master","SushiMoscow","Tokyobae","Tokyobae","Street 77","Chopar Pizza","MoscowPizza","PASTA PASTA","Maurice","Karadeniz","Maurice","Socials","Marmar","Bistro24","Gamarjoba","Gruzinskiy Dvornik","PASTA PASTA","MoscowPizza","Cafe il migliore","Mazzali","Mechta","Shahlo","Osh Kamolon","Gumma & Xonim","Olot somsa haqiqiysi","Yapona Mama","Wok","Tanuki","Woker","Takumi Sushi","Tanuki","Sushi Wok Master","Tokyobae","Coffee & Co","Dopamine Coffee","Wendy's","B & B","Taksim Kebab","Mahmud Kebab","Panda Dessert"};
        HashSet<String> uniqueStrings = new HashSet<>();

        int counter = 0;
        // Iterate over the array
        for (String str : All) {
            counter++;
            if (!uniqueStrings.contains(str)) {
                System.out.println(counter + "." + str);
                uniqueStrings.add(str);
            }
        }
        System.out.println("0. B A C K");
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

    public static void pasta() {
        String[] pasta = {"PASTA PASTA","Maurice"};
        int counter = 0;
        for (int i = 0; i < pasta.length; i++) {
            counter++;
            System.out.println(counter + "." + pasta[i]);
        }
    }

    public static void breakfasts() {
        String[] breakfasts = {"Coffe & Co","Karadeniz","Maurice","Socials"};
        int counter = 0;
        for (int i = 0; i < breakfasts.length; i++) {
            counter++;
            System.out.println(counter + "." + breakfasts[i]);
        }
    }

    public static void lunch() {
        String[] lunch = {"Marmar","Bistro24"};
        int counter = 0;
        for (int i = 0; i < lunch.length; i++) {
            counter++;
            System.out.println(counter + "." + lunch[i]);
        }
    }

    public static void georgia() {
        String[] georgia = {"Gamarjoba","Gruzinskiy Dvornik"};
        int counter = 0;
        for (int i = 0; i < georgia.length; i++) {
            counter++;
            System.out.println(counter + "." + georgia[i]);
        }
    }
    public static void italy() {
        String[] italy = {"PASTA PASTA","MoscowPizza","Cafe il migliore"};
        int counter = 0;
        for (int i = 0; i < italy.length; i++) {
            counter++;
            System.out.println(counter + "." + italy[i]);
        }
    }

    public static void russian() {
        String[] meals = {"Mazzali","Mechta","Shahlo"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }

    public static void uzbek() {
        String[] meals = {"Osh Kamolon","Gumma & Xonim","Olot somsa haqiqiysi"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }

    public static void asia() {
        String[] meals = {"Yapona Mama","Wok","Tanuki","Woker"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }

    public static void japan() {
        String[] meals = {"Takumi Sushi","Tanuki","Sushi Wok Master","Tokyobae"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }

    public static void coffee() {
        String[] meals = {"Coffee & Co","Dopamine Coffee","Wendy's","B & B"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }

    public static void desserts() {
        String[] meals = {"Taksim Kebab","Mahmud Kebab","Panda Dessert"};
        int counter = 0;
        for (int i = 0; i < meals.length; i++) {
            counter++;
            System.out.println(counter + "." + meals[i]);
        }
    }


}
