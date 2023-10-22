import java.util.Scanner;

public class Yandexeats {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Restaurants ");
        Methods.categories();
        String categorynums = scan.nextLine();
        int categorynumbers = Integer.parseInt(categorynums);
        switch (categorynumbers){
            case 1:
            break;
            case 2:
                Methods.carryout();
            break;
            case 3:
                Methods.sushi();
            break;
            case 4:
                Methods.pizza();
            break;
        }
    }
}
