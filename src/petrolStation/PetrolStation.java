package petrolStation;

import java.util.Scanner;

public class PetrolStation {
    public static void main(String[] args) {
        System.out.println("Welcome to petrol station!");

        Cart cart = new Cart();
        cart.getFuelOptions();
        cart.setFuelOptions();
        double totalPrice;
        cart.setTotalPrice(cart.getTotalPrice());


        Fuel[] fuel = getRandomFuel();
        for (int i = 0; i < fuel.length; i++) {
            System.out.println(i + ". " + fuel[i].getFuelName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose option from above:");

        int fuelChoice = scanner.nextInt();


        System.out.println("How many litres you like to buy?");

        double quantity = scanner.nextDouble();

        FuelOptions fuelOptions = new FuelOptions();

        fuelOptions.setQuantity(quantity);
        fuelOptions.setFuel(fuel[fuelChoice]);
        double price = fuel[fuelChoice].getFuelPrice() * quantity;
        fuelOptions.setPrice(price);

        System.out.println("You have refueled" + " " + quantity + "Litres for" + " " + price + "€");

        System.out.println("Would you like to add more fuel?");
        System.out.println("1.Yes \n2.No");
        System.out.println("Choose option above");

        int answer = scanner.nextInt();

    while (answer == 2) {
        System.out.println("Please pay for fuel:"+ " " + quantity + "Litres for" + " " + price + "€");
        break;
    }


    }

    private static Fuel[] getRandomFuel() {
        Fuel option1 = new Fuel();
        option1.setFuelName("Petrol 95");
        option1.setFuelPrice(1.99);

        Fuel option2 = new Fuel();
        option2.setFuelName("Petrol 98");
        option2.setFuelPrice(2.18);

        Fuel option3 = new Fuel();
        option3.setFuelName("Diesel");
        option3.setFuelPrice(1.89);

        return new Fuel[]{option1, option2, option3};
    }

}
