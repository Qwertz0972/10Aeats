import java.util.Random;
import java.util.Scanner;


public class Yandexeats {
    public static boolean TorF;
    public static boolean moreback = true;
    public static boolean backtomenu;
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        backtomenu = true;
        while (backtomenu) {
            Methods.categories();
            int categorynums = scan.nextInt();
            switch (categorynums) {
                case 1:
                    Methods.All();
                    backtomenu = false;
                    int restaurants = scan.nextInt();
                    switch (restaurants){
                        case 1:
                            break;
                        case 2:
                            Meals.yaponamama();
                            break;
                        case 0:
                            backtomenu = true;
                            break;
                    }
                    break;
                case 2:
                    Methods.carryout();
                    backtomenu = false;
                    int  carryoutrestaurants = scan.nextInt();
                    switch (carryoutrestaurants){
                        case 1:
                            break;
                        case 2:
                            Meals.yaponamama();
                    }
                    break;
                case 3:
                    Methods.burgers();
                    backtomenu = false;
                    int burgersrestaurants = scan.nextInt();
                    switch (burgersrestaurants){
                        case 1:
                            Example.Street77();
                            break;
                    }
                    break;
                case 4:
                    Methods.sushi();
                    backtomenu = false;
                    int sushirestaurants = scan.nextInt();
                    switch (sushirestaurants){
                        case 1:
                            Meals.yaponamama();
                        break;
                    }
                    break;
                case 5:
                    Methods.pizza();
                    backtomenu = false;
                    break;
                case 6:
                    Methods.pasta();
                    backtomenu = false;
                    break;
                case 7:
                    Methods.breakfasts();
                    backtomenu = false;
                    break;
                case 8:
                    Methods.lunch();
                    backtomenu = false;
                    break;
                case 9:
                    Methods.georgia();
                    backtomenu = false;
                    break;
                case 10:
                    Methods.italy();
                    backtomenu = false;
                    break;
                case 11:
                    moreback = true;
                    while (moreback) {
                        Methods.more();
                        int morenums = scan.nextInt();
                        switch (morenums) {
                            case 1:
                                Methods.russian();
                                moreback = false;backtomenu = false;
                                break;
                            case 2:
                                Methods.uzbek();
                                moreback = false;backtomenu = false;
                                break;
                            case 3:
                                Methods.asia();
                                break;
                            case 4:
                                Methods.japan();
                                break;
                            case 5:
                                Methods.coffee();
                                break;
                            case 6:
                                Methods.desserts();
                                break;
                            case 0:
                                moreback = false;
                                break;
                            default:
                                System.out.println("You didn't choose any menu :(");        //menu
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
