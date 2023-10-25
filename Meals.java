public class Meals {
    public static void yaponamama(){
        System.out.println("Y a p o n a     M a m a");
        System.out.println("S e t s ");
        String[] mealssets = {"Set Salmon: 50 sushis: 370.000 sum","Set Xarudonari: 44 sushis: 299.000 sum","Set Mika Love: 34 sushis: 264.000 sum","Set Califronia: 38 sushis: 255.000 sum","Set Kantan: 19 sushis: 104.000 sum"};
        int counter = 0;
        for (String mealsset : mealssets) {
            counter++;
            System.out.println(counter + "." + mealsset);
        }
        System.out.println("\n" + " S a l a d s ");
        String[] salads = {"Sendo sarada: 200g: 29.000 sum","Ebi sarada: 225g: 72.000 sum","Kani sarada: 225g: 33.000 sum","Mikdo sarada: 255g: 50.000 sum"};
        for (String salad : salads) {
            counter++;
            System.out.println(counter + "." + salad);
        }
        System.out.println("\n" + " S n a c k s ");
        String[] snacks = {"Classic Sandwiches: 4 sandwiches: 45.000 sum","Chicken and Kimchi shawarma: 2 in pack: 35.000 sum","Poke with tuna: 83.000 sum","Shrimp chips: 25.000 sum"};
        for (String snack : snacks) {
            counter++;
            System.out.println(counter + "." + snack);
        }
        System.out.println("\n" + " R o l l s ");
        String[] rolls = {"Filaboom 6 in pack: 35.000 sum","Vavilon 8 in pack: 59.000 sum","Thin roll with salmon 8 in pack: 35.000 sum","Thin roll with cucumber 8 in pack: 18.000 sum","Thin roll with shrimp 8 in pack: 37.000 sum","Thin roll with tuna 8 in pack: 41.000 sum"};
        for (String roll : rolls) {
            counter++;
            System.out.println(counter + "." + roll);
        }
        System.out.println("\n" + "20.B o o k     t h i s     m e a l s");
        System.out.println("\n" + "0.B A C K");
        int sumkorzina = 0;
        Yandexeats.TorF = true;
        while (Yandexeats.TorF) {
            int selectmeals = Yandexeats.scan.nextInt();
            switch (selectmeals) {
                case 1:
                    sumkorzina += 370000;
                    System.out.println("Narxi: " + 370000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 2:
                    sumkorzina += 299000;
                    System.out.println("Narxi: " + 299000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 3:
                    sumkorzina += 264000;
                    System.out.println("Narxi: " + 264000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 4:
                    sumkorzina += 255000;
                    System.out.println("Narxi: " + 255000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 5:
                    sumkorzina += 104000;
                    System.out.println("Narxi: " + 104000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 6:
                    sumkorzina += 29000;
                    System.out.println("Narxi: " + 29000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 7:
                    sumkorzina += 72000;
                    System.out.println("Narxi: " + 72000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 8:
                    sumkorzina += 33000;
                    System.out.println("Narxi: " + 33000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 9:
                    sumkorzina += 50000;
                    System.out.println("Narxi: " + 50000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 10:
                    sumkorzina += 45000;
                    System.out.println("Narxi: " + 45000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 11,14,16:
                    sumkorzina += 35000;
                    System.out.println("Narxi: " + 35000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 12:
                    sumkorzina += 83000;
                    System.out.println("Narxi: " + 83000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 13:
                    sumkorzina += 25000;
                    System.out.println("Narxi: " + 25000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 15:
                    sumkorzina += 59000;
                    System.out.println("Narxi: " + 59000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 17:
                    sumkorzina += 18000;
                    System.out.println("Narxi: " + 18000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 18:
                    sumkorzina += 37000;
                    System.out.println("Narxi: " + 37000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 19:
                    sumkorzina += 41000;
                    System.out.println("Narxi: " + 41000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 0:
                    Yandexeats.TorF = false;
                    Yandexeats.backtomenu = true;
                    break;
                case 20:
                    System.out.println("Your order costs: " + sumkorzina + " sum");
                    int randomNumber = Yandexeats.random.nextInt(41) + 20;
                    System.out.println("Your order will arrive in " + randomNumber + " minutes");
                    Yandexeats.TorF = false;
                    break;
                default:
                    System.out.println("You didn't choose meal");
                    break;
            }
        }
    }

    public static void wok() {
        System.out.println("W O K ");
        System.out.println("D R I N K S");
        String[] drinks = {"Sprite: 250ml: 8.000 sum", "Fanta: 250ml: 8.000 sum", "Coca-Cola: 250ml: 8.000 sum", "Coca-Cola: 1.5l: 17.000 sum", "Mineral water: 500ml: 4.000 sum"};
        int counter = 0;
        for (String drink : drinks) {
            counter++;
            System.out.println(counter + "." + drink);
        }
        System.out.println("\n" + "C O C K T A I L S");
        String[] cocktails = {"Berry Lemonade: 400ml: 17.900 sum", "Milkshake peach: 400ml: 19.900 sum", "Classic Moxito: 400ml: 17.900 sum", "Raspberry Lemonade: 400ml: 17.900 sum", "Ice tea: 400ml: 17.900 sum"};
        for (String cocktail : cocktails) {
            counter++;
            System.out.println(counter + "." + cocktail);
        }
        System.out.println("\n" + "R E A D Y    W O K");
        String[] readywok = {"Ramen with chicken in chili sauce: 380g: 36.900 sum", "Wheat noodles with beef in kung sauce: 380g: 38.900 sum", "Buckwheat noodles with chicken in sauce: 380g: 38.400 sum", "Udon with salmon in yakitori sauce: 380g: 56.500 sum", "Rice with shrimp in dasuan sauce: 380g; 66.500 sum"};
        for (String s : readywok) {
            counter++;
            System.out.println(counter + "." + s);
        }
        System.out.println("\n" + "S T A R T E R");
        String[] starter = {"Ramen soup: 250g: 50.500 sum", "Chinese spicy and sour soup: 200g: 34.000 sum", "Soup tori dzosuy: 250g: 27.500 sum"};
        for (String s : starter) {
            counter++;
            System.out.println(counter + "." + s);
        }
        System.out.println("\n" + "M A I N   C O U R S E");
        String[] maincourse = {"Kamo Yaki: 300g: 42.500 sum", "Spicy Chicken: 300g: 38.000 sum", "Yakitori chicken: 300g: 38.000 sum", "Tori Yakitori: 300g: 35.000 sum"};
        for (String s : maincourse) {
            counter++;
            System.out.println(counter + "." + s);
        }
        System.out.println("\n" + "23.B O O K   S E L E C T E D  M E A L S");
        System.out.println("\n" + "0.B A C K");
        int sumkorzina = 0;
        Yandexeats.TorF = true;
        while (Yandexeats.TorF) {
            int selectmeals = Yandexeats.scan.nextInt();
            switch (selectmeals) {
                case 1,2,3:
                    sumkorzina+= 8000;
                    System.out.println("Narxi: " + 8000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 4:
                    sumkorzina+= 17000;
                    System.out.println("Narxi: " + 17000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 5:
                    sumkorzina+= 4000;
                    System.out.println("Narxi: " + 4000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 6,8,9,10:
                    sumkorzina+=17900;
                    System.out.println("Narxi: " + 17900);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 7:
                    sumkorzina+=19900;
                    System.out.println("Narxi: " + 19900);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 11:
                    sumkorzina+=36900;
                    System.out.println("Narxi: " + 36900);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 12:
                    sumkorzina+=38900;
                    System.out.println("Narxi: " + 38900);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 13:
                    sumkorzina+=38400;
                    System.out.println("Narxi: " + 38400);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 14:
                    sumkorzina+=56500;
                    System.out.println("Narxi: " + 56500);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 15:
                    sumkorzina+=66500;
                    System.out.println("Narxi: " + 66500);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 16:
                    sumkorzina+=50500;
                    System.out.println("Narxi: " + 50500);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 17:
                    sumkorzina+= 34000;
                    System.out.println("Narxi: " + 34000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 18:
                    sumkorzina+= 27500;
                    System.out.println("Narxi: " + 27500);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 19:
                    sumkorzina+= 42500;
                    System.out.println("Narxi: " + 42500);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 20, 21:
                    sumkorzina+= 38000;
                    System.out.println("Narxi: " + 38000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 22:
                    sumkorzina+= 35000;
                    System.out.println("Narxi: " + 35000);
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 0:
                    Yandexeats.TorF = false;
                    Yandexeats.backtomenu = true;
                    break;
                case 23:
                    if(sumkorzina == 0){
                        System.out.println("You didn't choose meal to order");
                    }else {
                        System.out.println("Your order costs: " + sumkorzina + " sum");
                        int randomNumber = Yandexeats.random.nextInt(41) + 20;
                        System.out.println("Your order will arrive in " + randomNumber + " minutes");
                        Yandexeats.TorF = false;
                    }
                    break;
                default:
                    System.out.println("You didn't choose meal :(");
                    break;
            }
        }
    }

    public static void maurice(){
        System.out.println("M A U R I C E");
        System.out.println("B R E A K F A S T S");
        String[] breakfasts = {"Pancakes with chicken: 345g: 51.000 sum","Pancakes with cheese and mushrooms: 305g: 51.000 sum","Rice porridge: 270g: 52.000 sum","Viennese waffles with salmon: 225g: 165.000 sum","Eastern breakfast: 330g: 99.000sum","French breakfast: 200g: 109.000 sum","English breakfast: 290g: 109.000 sum","Italian breakfast: 220g: 109.000 sum"};
        int counter = 0;
        for (String breakfast : breakfasts) {
            counter++;
            System.out.println(counter + "." + breakfast);
        }
        System.out.println("\n" + "S A L A D S");
        String[] salads = {"Salad with mung bean sprouts and Pak choy: 360g: 86.000 sum","Salad with crispy eggplant and spicy peanuts: 290g: 97.000 sum","Caesar with chicken: 340g: 89.000 sum","Salad with lightly salted salmon: 280g: 166.000 sum"};
        for (String salad : salads) {
            counter++;
            System.out.println(counter + "." + salad);
        }
        Yandexeats.TorF = true;

    }
}
