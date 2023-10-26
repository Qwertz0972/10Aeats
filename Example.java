import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void Street77() {

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int balans=1_000_000;

        int vaqt;
        vaqt = random.nextInt(10, 40);


        System.out.println("MENU ");
        System.out.println("1. Pizza    2. Burgers    3. Rolli ");
        System.out.println("4. Hot dogs    2. Snacks    6. Combo");
        System.out.println("7. Sets    8. Kurochka77    9.Salads");
        System.out.println("10. Coctales    11. Beverages    12.Souce ");
        int menu=scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("1. Street77    2. Combo    3. Chicken    4.Margarita    5.Pepperoni");
                int pizzamenu = scanner.nextInt();
                switch (pizzamenu){
                    case 1:
                        System.out.println("Street77 narxi 66000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int street77narxi= scanner.nextInt();
                        if (street77narxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*66000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz street77ga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Combo narxi 66000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Combonarxi= scanner.nextInt();
                        if (Combonarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*66000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Comboga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Chicken narxi 63000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Chickennarxi= scanner.nextInt();
                        if (Chickennarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*63000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chickenga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println(" Margarita narxi 54000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Margaritanarxi= scanner.nextInt();
                        if (Margaritanarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*54000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Margaritaga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println(" Pepperoni narxi 63000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Pepperoninarxi= scanner.nextInt();
                        if (Pepperoninarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*63000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Pepperoniga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("1. Double Burger    2. Tower Burger    3.Double Cheese");
                System.out.println("4. Street Burger    5. Street Cheese    6.Chicken Burger ");
                int burgermenu = scanner.nextInt();
                switch (burgermenu){
                    case 1:
                        System.out.println("Double Burger narxi 40000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int DoubleBurgernarxi= scanner.nextInt();
                        if (DoubleBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*40000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz DoubleBurgerga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Tower Burger narxi 32000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int TowerBurgernarxi= scanner.nextInt();
                        if (TowerBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*32000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Tower Burgerga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Double Cheese narxi 42000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int DoubleCheesenarxi= scanner.nextInt();
                        if (DoubleCheesenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*42000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz DouhbleCheesega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Street Burger narxi 28000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int StreetBurgernarxi= scanner.nextInt();
                        if (StreetBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*28000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Street Burgerga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Street Cheese narxi 30000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int StreetCheesenarxi= scanner.nextInt();
                        if (StreetCheesenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*30000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz StreetCheese buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 6:
                        System.out.println("chicken Burger narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int ChichkenBurgernarxi= scanner.nextInt();
                        if (ChichkenBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken Burger buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;

                }
                break;
            case 3:
                System.out.println("1. Beef Roll    2. Big Box    3. Street Roll");
                System.out.println("4. Sezar Roll    5. Cheese Roll    6.Chicken flip");
                int Rollmenu = scanner.nextInt();
                switch (Rollmenu){
                    case 1:
                        System.out.println("Beef Roll narxi 26000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int BeefRollnarxi= scanner.nextInt();
                        if (BeefRollnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*26000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Beef Rollga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Big Box narxi 26000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int BigBoxnarxi= scanner.nextInt();
                        if (BigBoxnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*26000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Big Boxga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Street Roll narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int StreetRollnarxi= scanner.nextInt();
                        if (StreetRollnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Street Rollga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Sezar Roll narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int SezarRollnarxi= scanner.nextInt();
                        if (SezarRollnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Sezar Rollga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Cheese Roll narxi 28000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int CheeseRollnarxi= scanner.nextInt();
                        if (CheeseRollnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*28000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Cheese Rollga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 6:
                        System.out.println("Chicken Flip narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Chickenflipnarxi= scanner.nextInt();
                        if (Chickenflipnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken flipga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;

                }
                break;
            case 4:
                System.out.println("1. Hot dog    2. King Hot dog    3. Hot dog Cheese");
                System.out.println("4. Potato Hot dog    5. Vegetarian    6. Longer BBQ");
                int Hotdogmenu = scanner.nextInt();
                switch (Hotdogmenu){
                    case 1:
                        System.out.println("Hot Dog narxi 17000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int HotDognarxi= scanner.nextInt();
                        if (HotDognarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*17000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz HotDogga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("King Hot Dog narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int KingHotDognarxi= scanner.nextInt();
                        if (KingHotDognarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz King Hot Dogga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Hot Dog Cheese narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int HotDogCheesenarxi= scanner.nextInt();
                        if (HotDogCheesenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Hot Dog Cheesega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Potato Hot Dog narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int PotatoHotDognarxi= scanner.nextInt();
                        if (PotatoHotDognarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Potato Hot Dogga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Vegetarian narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Vegetariannarxi= scanner.nextInt();
                        if (Vegetariannarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Vegetarianga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 6:
                        System.out.println("Longer BBQ narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int LongerBBQnarxi= scanner.nextInt();
                        if (LongerBBQnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz LOnger BBQga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 5:
                System.out.println("1. Potato Free    2. Chicken corn    3.Nuggets");
                int snacksmenu = scanner.nextInt();
                switch (snacksmenu){
                    case 1:
                        System.out.println("POtato Free narxi 13000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int PotatoFreenarxi= scanner.nextInt();
                        if (PotatoFreenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*13000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz PotatoFreega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Chicken corn narxi 30000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Chickencornnarxi= scanner.nextInt();
                        if (Chickencornnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*30000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken cornga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Nuggets narxi 22000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Nuggetsnarxi= scanner.nextInt();
                        if (Nuggetsnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*22000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Nuggetsga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 6:
                System.out.println("1. Big Box    2. Chicken flip    3. Chicken Burger    4. BBQ    5. Street Burger");
                int combomenu = scanner.nextInt();
                switch (combomenu){
                    case 1:
                        System.out.println("Big Box narxi 59000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int BigBoxnarxi= scanner.nextInt();
                        if (BigBoxnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*59000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Big Boxga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("chicken flip narxi 52000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Chickenflipnarxi= scanner.nextInt();
                        if (Chickenflipnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*52000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken flipga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("  Chicken Burger narxi 53000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int ChickenBurgernarxi= scanner.nextInt();
                        if (ChickenBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*53000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken Burgerga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("BBQ narxi 52000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int BBQnarxi= scanner.nextInt();
                        if (BBQnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*52000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz BBQga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Street Burger narxi 52000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int StreetBurgernarxi= scanner.nextInt();
                        if (StreetBurgernarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*52000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz StreetBurgerga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 7:
                System.out.println("1. Tripple Box Pepperoni    2. 3 for 99    3. 5 for 125 ");
                int setsmenu = scanner.nextInt();
                switch (setsmenu){
                    case 1:
                        System.out.println("Tripple Box  Pepperoni narxi 134000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int TrippleBoxPepperoninarxi= scanner.nextInt();
                        if (TrippleBoxPepperoninarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*134000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Tripple Box Pepperoniga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("3 for 99 narxi 99000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int setnarxi= scanner.nextInt();
                        if (setnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*99000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz 3 for 99ga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("5 for 125 narxi 125000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int set3narxi= scanner.nextInt();
                        if (set3narxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*125000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz 5 for 125ga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 8:
                System.out.println("1.Street Busket    2. Spice Busket    3. Chicken wings    4. Chicken strips");
                int Kurochka77 = scanner.nextInt();
                switch (Kurochka77){
                    case 1:
                        System.out.println("Street Busket narxi 90000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int StreetBusketnarxi= scanner.nextInt();
                        if (StreetBusketnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*90000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz StreetBusketga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Spice Busket narxi 80000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int SpiceBusketnarxi= scanner.nextInt();
                        if (SpiceBusketnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*80000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Spice Busketga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Chicken wings narxi 40000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int ChickenWingsnarxi= scanner.nextInt();
                        if (ChickenWingsnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*40000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken Wingsga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Chicken Strips narxi 16000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int ChickenStripsnarxi= scanner.nextInt();
                        if (ChickenStripsnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*16000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Chicken Stripsga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;


                }
                break;
            case 9:
                System.out.println("1. Sezar Salad    2. Greek Salad    3. Fresh Salad");
                int saladmenu= scanner.nextInt();
                switch (saladmenu){
                    case 1:
                        System.out.println("Sezar Salad narxi 22000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int SezarSaladnarxi= scanner.nextInt();
                        if (SezarSaladnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*22000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Sezar Saladga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Greek Salad narxi 22000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int GreekSaladnarxi= scanner.nextInt();
                        if (GreekSaladnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*22000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Greek Saladga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Fresh Salad narxi 10000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int FreshSaladnarxi= scanner.nextInt();
                        if (FreshSaladnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*10000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Fresh Saladga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 10:
                System.out.println("1. Berry limonade    2. Limonade Mango    3. Pommogranate limonade");
                System.out.println("4. Classic Moxito    5. Moxito Strawberry    6. Ice Tea");
                System.out.println("7. Milkshake Peach    8. Milkshake chocolate    9. Milkshake Banana");
                int Coctalemenu= scanner.nextInt();
                switch (Coctalemenu){
                    case 1:
                        System.out.println("Berry limonade narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Berrylimonadenarxi= scanner.nextInt();
                        if (Berrylimonadenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Berry limonadega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Limonade Mango narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int LimonadeMangonarxi= scanner.nextInt();
                        if (LimonadeMangonarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Limonade Mangoga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Pommogranate limonade narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Pommogranatelimonadenarxi= scanner.nextInt();
                        if (Pommogranatelimonadenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Pommogranate limonadega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Classic Moxito narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int ClassicMoxitonarxi= scanner.nextInt();
                        if (ClassicMoxitonarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Classic Moxitoga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Moxito Strawberry narxi 19000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Moxitostrawberrynarxi= scanner.nextInt();
                        if (Moxitostrawberrynarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*19000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Moxito Strawberryga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 6:
                        System.out.println("Ice Tea narxi 18000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int IceTeanarxi= scanner.nextInt();
                        if (IceTeanarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*18000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Ice Teaga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 7:
                        System.out.println("Milkshake Peach narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Milkshakenarxi= scanner.nextInt();
                        if (Milkshakenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Milkshake peachga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 8:
                        System.out.println("ilkshake Chocolate narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int MilkshakeChocolatenarxi= scanner.nextInt();
                        if (MilkshakeChocolatenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Milkshake Chocolatega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 9:
                        System.out.println("Milkshake Banana narxi 20000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int MilkshakeBanananarxi= scanner.nextInt();
                        if (MilkshakeBanananarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*20000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Milkshake Bananaga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 11:
                System.out.println("1. Coca Cola    2. Sprite    3. Fanta");
                System.out.println("4. Water    5. Pepsi    6. Hydrolife");
                int Beveragesmenu= scanner.nextInt();
                switch (Beveragesmenu){
                    case 1:
                        System.out.println("Coca Cola narxi 8000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int CocaColanarxi= scanner.nextInt();
                        if (CocaColanarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*8000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Coca colaga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Sprite narxi 8000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Spritenarxi= scanner.nextInt();
                        if (Spritenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*8000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Spritega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println("Fanta narxi 8000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Fantanarxi= scanner.nextInt();
                        if (Fantanarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*8000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Fnataga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 4:
                        System.out.println("Water narxi 4000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Waternarxi= scanner.nextInt();
                        if (Waternarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*4000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Waterga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 5:
                        System.out.println("Pepsi narxi 17000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Pepsinarxi= scanner.nextInt();
                        if (Pepsinarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*17000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Pepsi buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 6:
                        System.out.println("Hydrolife narxi 5000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Hydrolifenarxi= scanner.nextInt();
                        if (Hydrolifenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*5000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Hydrolifega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            case 12:
                System.out.println("1. Ketchup    2. Sezar souce    3. Souce chili ");
                int Souce= scanner.nextInt();
                switch (Souce){
                    case 1:
                        System.out.println("Ketchup narxi 2000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int Ketchupnarxi= scanner.nextInt();
                        if (Ketchupnarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*2000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Ketchupga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 2:
                        System.out.println("Sezar souce narxi 3000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int sezarsoucenarxi= scanner.nextInt();
                        if (sezarsoucenarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*3000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Sezar soucega buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                    case 3:
                        System.out.println(" Souce chilinarxi 4000 ");
                        System.out.println("Buyurtma qilasizmi 1.HA , 2.YO'Q ");
                        int SouceChilinarxi= scanner.nextInt();
                        if (SouceChilinarxi==1){
                            System.out.println("Nechta buyurtma qilasiz");
                            int buyurtma= scanner.nextInt();
                            int buyurtmapuli=buyurtma*4000;
                            balans=balans-buyurtmapuli;
                            System.out.println("Siz Souce Chiliga buyurtma qildingiz narxi "+ buyurtmapuli +" sum bo'ldi va sizda "+ balans +" sum pul qoldi. ");
                            System.out.println("Sizning buyurtmangiz "+ vaqt +" daqiqa ichida yetib boradi. ");
                        }
                        break;
                }
                break;
            default:
                System.out.println("Hato raqam kiritildi! qaytadan urunib ko'ring. ");
        }
    }
}

