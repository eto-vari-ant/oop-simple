import java.util.Scanner;

public class HotDogCafe {
    private boolean cafeIsOpen = false;

    public boolean isOpen() {
        cafeIsOpen = true;
        return cafeIsOpen;
    }

    public boolean isClose() {
        cafeIsOpen = false;
        return cafeIsOpen;
    }

    public boolean addIngredient(Boolean b) {
        b = true;
        return b;
    }

    public void hello() {
        HotDogs hotDogBranded = new HotDogs();
        hotDogBranded.setCheese(true);
        hotDogBranded.setKetchup(true);
        hotDogBranded.setMayonnaise(true);
        hotDogBranded.setSausage(true);

        HotDogs hotDogSpicy = new HotDogs();
        hotDogSpicy.setKoreanCarrot(true);
        hotDogSpicy.setSpicySause(true);
        hotDogSpicy.setMustard(true);
        hotDogSpicy.setSausage(true);

        HotDogs hotDogVegeterian = new HotDogs();
        hotDogVegeterian.setCucumber(true);
        hotDogVegeterian.setKetchup(true);
        hotDogVegeterian.setMustard(true);
        hotDogVegeterian.setPepper(true);
        hotDogVegeterian.setPotato(true);
        hotDogVegeterian.setTomato(true);
        if (cafeIsOpen == true) {
            System.out.println("Helllooo! Welcome to the best cafe everr! You must taste our hot dogs!");
            System.out.println("Can I offer you one of our most popular hot dogs?? yes or no?");
            Scanner sc = new Scanner(System.in);
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equalsIgnoreCase(new String("yes"))) {
                int a = (int) (Math.random() * 3);
                if (a == 0) {
                    System.out.println(
                            "Our branded hot dog consists of cheese, ketchup, mayonnaise and sausage of cource!");
                    System.out.println("The most popular varianr is always the best))");
                    System.out.println("Would you like to buy it?? (yes or no)");
                    Scanner sc2 = new Scanner(System.in);
                    String yesOrNo2 = sc2.nextLine();
                    if (yesOrNo2.equalsIgnoreCase(new String("yes"))) {
                        readyHotDog(hotDogBranded);
                    } else if (yesOrNo2.equalsIgnoreCase(new String("no"))) {
                        System.out.println("Okkk... Strangely... So! Lets create your own hot dog!");
                        creating();
                    } else {
                        System.out.println("No no no... Dont ignore rules!");
                    }
                } else if (a == 1) {
                    System.out.println("Our spicy hot dog is for really spicy person!");
                    System.out.println("Spicy sause and korean parrot will impress you!");
                    System.out.println("Would you like to buy it?? (yes or no)");
                    Scanner sc2 = new Scanner(System.in);
                    String yesOrNo2 = sc2.nextLine();
                    if (yesOrNo2.equalsIgnoreCase(new String("yes"))) {
                        readyHotDog(hotDogSpicy);
                    } else if (yesOrNo2.equalsIgnoreCase(new String("no"))) {
                        System.out.println("Okkk... Strangely... So! Lets create your own hot dog!");
                        creating();
                    } else {
                        System.out.println("No no no... Dont ignore rules!");
                    }
                } else {
                    System.out.println("I can offer you our vegeterian hot dog!");
                    System.out.println("Sausages are yummy, but think about destitute animals((");
                    System.out.println("Would you like to buy it?? (yes or no)");
                    Scanner sc2 = new Scanner(System.in);
                    String yesOrNo2 = sc2.nextLine();
                    if (yesOrNo2.equalsIgnoreCase(new String("yes"))) {
                        readyHotDog(hotDogVegeterian);
                    } else if (yesOrNo2.equalsIgnoreCase(new String("no"))) {
                        System.out.println("Okkk... Strangely... So! Lets create your own hot dog!");
                        creating();
                    } else {
                        System.out.println("No no no... Dont ignore rules!");
                    }
                }
            } else if (yesOrNo.equalsIgnoreCase(new String("no"))) {
                System.out.println("So! Lets create your own hot dog!");
                creating();
            } else {
                System.out.println("No no no... Dont ignore rules!");
            }

        } else {
            System.out.println("Sorry, we are closed(( ");
        }
    }

    public static void creating() {
        System.out.println("We have mannyyy ingredients!");
        System.out.println("Check our menu:");
        System.out.println("1. cheese ");
        System.out.println("2. mayonnaise");
        System.out.println("3. spicy sause");
        System.out.println("4. ketchup");
        System.out.println("5. mustard");
        System.out.println("6. sausage");
        System.out.println("7. cucumber");
        System.out.println("8. tomato");
        System.out.println("9. pepper");
        System.out.println("10. korean carrot");
        System.out.println("11. potato");
        System.out.println("How many ingredients do you want to add? (write the number)");
        HotDogs myHotDog = new HotDogs();
        Scanner sc3 = new Scanner(System.in);
        int ingr = sc3.nextInt();
        if (ingr > 0 && ingr < 12) {
            System.out.println("Please, write the number of every ingredient(using ENTER after every point)");
            int[] arr = new int[ingr];
            Scanner sc4 = new Scanner(System.in);
            for (int i = 0; i < ingr; i++) {
                arr[i] = sc4.nextInt();
            }
            for (int i = 0; i < ingr; i++) {
                switch (arr[i]) {
                    case 1:
                        System.out.println("You add cheese!");
                        myHotDog.setCheese(true);
                        break;
                    case 2:
                        System.out.println("You add mayonnaise!");
                        myHotDog.setMayonnaise(true);
                        break;
                    case 3:
                        System.out.println("You add spicy sause!!");
                        myHotDog.setSpicySause(true);
                        break;
                    case 4:
                        System.out.println("You add ketchup!");
                        myHotDog.setKetchup(true);
                        break;
                    case 5:
                        System.out.println("You add mustard!");
                        myHotDog.setMustard(true);
                        break;
                    case 6:
                        System.out.println("You add sausage!");
                        myHotDog.setSausage(true);
                        break;
                    case 7:
                        System.out.println("You add cucumber!");
                        myHotDog.setCucumber(true);
                        break;
                    case 8:
                        System.out.println("You add tomato!");
                        myHotDog.setTomato(true);
                        break;
                    case 9:
                        System.out.println("You add pepper!");
                        myHotDog.setPepper(true);
                        break;
                    case 10:
                        System.out.println("You add korean carrot!!");
                        myHotDog.setKoreanCarrot(true);
                        break;
                    case 11:
                        System.out.println("You add potato!");
                        myHotDog.setPotato(true);
                        break;
                    default:
                        System.out.println("We havent this point!!");
                        break;
                }

            }
        } else {
            System.out.println("Dont do that!");
        }
        readyHotDog(myHotDog);

    }

    public static void readyHotDog(HotDogs h) {
        double cost = 0;
        System.out.println();
        System.out.print("Your hot dog consists of: ");
        if (h.isBread() == true) {
            System.out.print("bread, ");
            cost+=0.2;
        }
        if (h.isCheese() == true) {
            System.out.print("cheese, ");
            cost+=0.35;
        }
        if (h.isCucumber() == true) {
            System.out.print("cucumber, ");
            cost+=0.2;
        }
        if (h.isKetchup() == true) {
            System.out.print("ketchup, ");
            cost+=0.15;
        }
        if (h.isKoreanCarrot() == true) {
            System.out.print("korean carrot, ");
            cost+=0.2;
        }
        if (h.isMayonnaise() == true) {
            System.out.print("mayonnaise, ");
            cost+=0.15;
        }
        if (h.isMustard() == true) {
            System.out.print("mustard, ");
            cost+=0.15;
        }
        if (h.isPepper() == true) {
            System.out.print("pepper, ");
            cost+=0.2;
        }
        if (h.isPotato() == true) {
            System.out.print("potato, ");
            cost+=0.2;
        }
        if (h.isSausage() == true) {
            System.out.print("sausage, ");
            cost+=0.5;
        }
        if (h.isSpicySause() == true) {
            System.out.print("spicy sause, ");
            cost+=0.15;
        }
        if (h.isTomato() == true) {
            System.out.print("tomato, ");
            cost+=0.2;
        }
        System.out.print("mmm so yummy!");
        System.out.println();
        System.out.print("The cost is: ");
        System.out.printf("%.2f", cost);
        System.out.println();
        System.out.println("Thank you! Good Bye!");
    }
}
