import java.util.Random;
import java.util.Scanner;


public class Yandexeats {
    public static boolean TorF;
    public static boolean moreBack = true;
    public static boolean backToMenu;
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    public static String[] login = {"yandexeats@mail.ru", "anonymous@gmail.com", "m1lkyway1@outlook.com"};
    public static String[] password = {"yandex25", "2102july", "m1lk1"};

    public static void main(String[] args) {
        System.out.print("Log in: ");
        String logincheck = scan.nextLine();
        System.out.print("Enter the password: ");
        String passwordcheck = scan.nextLine();
        for (int i = 0; i < login.length; i++) {
            if (logincheck.equals(login[i]) && passwordcheck.equals(password[i])) {


                backToMenu = true;
                while (backToMenu) {
                    Methods.categories();
                    int categorynums = scan.nextInt();
                    switch (categorynums) {
                        case 1:
                            All();
                            break;
                        case 2:
                            Carryout();
                            break;
                        case 3:
                            Burgers();
                            break;
                        case 4:
                            Sushi();
                            break;
                        case 5:
                            Pizza();
                            break;
                        case 6:
                            Pasta();
                            break;
                        case 7:
                            Breakfasts();
                            break;
                        case 8:
                            Lunch();
                            break;
                        case 9:
                            Georgia();
                            break;
                        case 10:
                            Italy();
                            break;
                        case 11:
                            moreBack = true;
                            while (moreBack) {
                                Methods.more();
                                int morenums = scan.nextInt();
                                switch (morenums) {
                                    case 1:
                                        Methods.russian();
                                        moreBack = false;
                                        backToMenu = false;
                                        break;
                                    case 2:
                                        Methods.uzbek();
                                        moreBack = false;
                                        backToMenu = false;
                                        break;
                                    case 3:
                                        Asia();
                                        break;
                                    case 4:
                                        Japan();
                                        break;
                                    case 5:
                                        Coffee();
                                        break;
                                    case 6:
                                        Desserts();
                                        break;
                                    case 0:
                                        moreBack = false;
                                        break;
                                    default:
                                        System.out.println("You didn't choose any menu :(");        //menu
                                        break;
                                }
                            }
                            break;
                    }
                }
            }else if(!passwordcheck.equals(password[2])){
                System.out.println("Incorrect login,username or password");
            }
        }
    }

    private static void Desserts() {
        Methods.desserts();
        moreBack = false;
        backToMenu = false;
    }

    private static void Coffee() {
        Methods.coffee();
        moreBack = false;
        backToMenu = false;
    }

    private static void Japan() {
        Methods.japan();
        moreBack = false;
        backToMenu = false;
    }

    private static void Asia() {
        Methods.asia();
        moreBack = false;
        backToMenu = false;
        int asiarestaurants = scan.nextInt();
        switch (asiarestaurants) {
            case 1:
                Meals.yaponamama();
                break;
            case 2:
                Meals.wok();
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Italy() {
        Methods.italy();
        backToMenu = false;
        int italianrestaurants = scan.nextInt();
        switch (italianrestaurants) {
            case 1:
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Georgia() {
        Methods.georgia();
        backToMenu = false;
        int georgianrestaurants = scan.nextInt();
        switch (georgianrestaurants) {
            case 1:
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Lunch() {
        Methods.lunch();
        backToMenu = false;
        int lunchrestaurants = scan.nextInt();
        switch (lunchrestaurants) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Breakfasts() {
        Methods.breakfasts();
        backToMenu = false;
        int breakfastrestaurants = scan.nextInt();
        switch (breakfastrestaurants) {
            case 1:
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Pasta() {
        Methods.pasta();
        backToMenu = false;
        int pastarestaurants = scan.nextInt();
        switch (pastarestaurants) {
            case 1:
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Pizza() {
        Methods.pizza();
        backToMenu = false;
        int pizzarestaurants = scan.nextInt();
        switch (pizzarestaurants) {
            case 1:
                Example.Street77();
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Sushi() {
        Methods.sushi();
        backToMenu = false;
        int sushirestaurants = scan.nextInt();
        switch (sushirestaurants) {
            case 1:
                Meals.yaponamama();
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Burgers() {
        Methods.burgers();
        backToMenu = false;
        int burgersrestaurants = scan.nextInt();
        switch (burgersrestaurants) {
            case 1:
                Example.Street77();
                break;
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void Carryout() {
        Methods.carryout();
        backToMenu = false;
        int carryoutRestaurants = scan.nextInt();
        switch (carryoutRestaurants) {
            case 1:
                Meals.wok();
                break;
            case 2:
                Meals.yaponamama();
            case 0:
                backToMenu = true;
                break;
        }
    }

    private static void All() {
                Methods.All();
                backToMenu = false;
                int restaurants1 = scan.nextInt();
                switch (restaurants1) {
                    case 1:
                        Meals.wok();
                        break;
                    case 2:
                        Meals.yaponamama();
                        break;
                    case 3:
                        Example.Street77();
                        break;
                    case 4:
                        Meals.maurice();
                        break;
                    case 0:
                        backToMenu = true;
                        break;
                }
            }
        }


