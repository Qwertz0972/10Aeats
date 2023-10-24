public class Meals {
    public static void yaponamama(){
        System.out.println("Y a p o n a     M a m a");
        System.out.println(" S e t s ");
        String[] mealssets = {"Set Salmon: 50 sushis: 370.000 sum","Set Xarudonari: 44 sushis: 299.000 sum","Set Mika Love: 34 sushis: 264.000 sum","Set Califronia: 38 sushis: 255.000 sum","Set Kantan: 19 sushis: 104.000 sum"};
        int counter = 0;
        for (int i = 0; i < mealssets.length;i++){
            counter++;
            System.out.println(counter + "." + mealssets[i]);
        }
        System.out.println("\n" + " S a l a d s ");
        String[] salads = {"Sendo sarada: 200g: 29.000 sum","Ebi sarada: 225g: 72.000 sum","Kani sarada: 225g: 33.000 sum","Mikdo sarada: 255g: 50.000 sum"};
        for (int i = 0; i < salads.length;i++){
            counter++;
            System.out.println(counter + "." + salads[i]);
        }
        System.out.println("\n" + " S n a c k s ");
        String[] snacks = {"Classic Sandwiches: 4 sandwiches: 45.000 sum","Shaurma with chicken and kimchi: 2 shaurmas: 35.000 sum","Poke with tuna: 83.000 sum","Shrimp chips: 25.000 sum"};
        for (int i = 0; i < snacks.length;i++){
            counter++;
            System.out.println(counter + "." + snacks[i]);
        }
        System.out.println("\n" + " R o l l s ");
        String[] rolls = {"Filaboom 6 in pack: 35.000 sum","Vavilon 8 in pack: 59.000 sum","Thin roll with salmon 8 in pack: 35.000 sum","Thin roll with cucumber 8 in pack: 18.000 sum","Thin roll with shrimp 8 in pack: 37.000 sum","Thin roll with tuna 8 in pack: 41.000 sum"};
        for (int i = 0; i < rolls.length;i++){
            counter++;
            System.out.println(counter + "." + rolls[i]);
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
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 2:
                    sumkorzina += 299000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 3:
                    sumkorzina += 264000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 4:
                    sumkorzina += 255000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 5:
                    sumkorzina += 104000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 6:
                    sumkorzina += 29000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 7:
                    sumkorzina += 72000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 8:
                    sumkorzina += 33000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 9:
                    sumkorzina += 50000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 10:
                    sumkorzina += 45000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 11,14,16:
                    sumkorzina += 35000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 12:
                    sumkorzina += 83000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 13:
                    sumkorzina += 25000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 15:
                    sumkorzina += 59000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 17:
                    sumkorzina += 18000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 18:
                    sumkorzina += 37000;
                    System.out.println("Sum money: " + sumkorzina);
                    break;
                case 19:
                    sumkorzina += 41000;
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
}
