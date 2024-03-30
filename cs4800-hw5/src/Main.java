import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerOrder order = new CustomerOrder();
        boolean SENTINEL = false;
        Scanner reader = new Scanner(System.in);

        Membership member = new Membership();
        member.setLoyaltyDiscount(0.10F);

        Food burger = new Burger();
        BurgerDecorator burgerPlus = new BurgerDecorator(new Burger());

        System.out.println("Restaurant Menu");

        System.out.println("\nBurger: " + burger.basePrice());

        Food fries = new Fries();
        FriesDecorator friesPlus = new FriesDecorator(new Fries());

        System.out.println("\nFries: " + fries.basePrice());

        Food cornDog = new CornDog();
        CornDogDecorator cornDogPlus = new CornDogDecorator(new CornDog());

        System.out.println("\nCorn Dog: " + cornDog.basePrice());

        Food onionRings = new OnionRings();
        OnionRingsDecorator onionRingsPlus = new OnionRingsDecorator(new OnionRings());

        System.out.println("\nOnion Rings: " + onionRings.basePrice());

        System.out.println("\nFrom the above list, enter items to order. (q to quit)");
        while(SENTINEL == false) {
            String userEntry = reader.nextLine();
            if(Objects.equals(userEntry, "q")) {
                SENTINEL = true;
                order.displayCustomerOrder();
                break;
            }
            else {
                order.addItemToCustomerOrder(userEntry);
            }
        }

        for(int i = 0; i < order.getCustomerOrder().size(); i++) {
            switch(order.getCustomerOrder().get(i)) {
                case "Burger": {
                    order.addToOrderTotal(burger.basePrice());

                    System.out.println("Additional Toppings: " + burgerPlus.getAdditionalToppings());
                    System.out.println("Add burger toppings? (q for none)");

                    SENTINEL = false;
                    while(SENTINEL == false) {
                        String userEntry = reader.nextLine();
                        if(Objects.equals(userEntry, "q")) {
                            break;
                        }
                        else {
                            order.addItemToCustomerOrder(userEntry);
                        }
                    }
                    break;
                }
                case "Fries": {
                    order.addToOrderTotal(fries.basePrice());

                    System.out.println("Additional Toppings: " + friesPlus.getAdditionalToppings());
                    System.out.println("Add fry toppings? (q for none)");

                    SENTINEL = false;
                    while(SENTINEL == false) {
                        String userEntry = reader.nextLine();
                        if(Objects.equals(userEntry, "q")) {
                            break;
                        }
                        else {
                            order.addItemToCustomerOrder(userEntry);
                        }
                    }
                    break;
                }
                case "Corn Dog": {
                    order.addToOrderTotal(cornDog.basePrice());

                    System.out.println("Additional Toppings: " + cornDogPlus.getAdditionalToppings());
                    System.out.println("Add corn dog toppings? (q for none)");

                    SENTINEL = false;
                    while(SENTINEL == false) {
                        String userEntry = reader.nextLine();
                        if(Objects.equals(userEntry, "q")) {
                            break;
                        }
                        else {
                            order.addItemToCustomerOrder(userEntry);
                        }
                    }
                    break;
                }
                case "Onion Rings": {
                    order.addToOrderTotal(onionRings.basePrice());

                    System.out.println("Additional Toppings: " + onionRingsPlus.getAdditionalToppings());
                    System.out.println("Add onion ring toppings? (q for none)");

                    SENTINEL = false;
                    while(SENTINEL == false) {
                        String userEntry = reader.nextLine();
                        if(Objects.equals(userEntry, "q")) {
                            break;
                        }
                        else {
                            order.addItemToCustomerOrder(userEntry);
                        }
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }

        for(int i = 0; i < order.getCustomerOrder().size(); i++) {
            switch (order.getCustomerOrder().get(i)) {
                case "Onions": {
                }
                case "Extra Cheese": {
                    order.addToOrderTotal(burgerPlus.getAdditionalToppings().get(order.getCustomerOrder().get(i)));
                    break;
                }

                case "Chili": {
                }
                case "Shredded Cheese": {

                    order.addToOrderTotal(friesPlus.getAdditionalToppings().get(order.getCustomerOrder().get(i)));
                    break;
                }

                case "Ketchup": {
                }
                case "Mustard": {

                    order.addToOrderTotal(cornDogPlus.getAdditionalToppings().get(order.getCustomerOrder().get(i)));
                    break;
                }

                case "Ranch": {
                }
                case "Garlic Mayonnaise": {
                    order.addToOrderTotal(onionRingsPlus.getAdditionalToppings().get(order.getCustomerOrder().get(i)));
                    break;
                }

                default: {
                    break;
                }
            }
        }
        System.out.println("Customer Order: " + order.getCustomerOrder());

        float totalCost = order.getOrderTotal() * (1 - member.getLoyaltyDiscount());
        System.out.println("Total Payment after discount: $" + totalCost);

    }
}
