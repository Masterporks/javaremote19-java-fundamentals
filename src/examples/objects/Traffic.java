package examples.objects;

/**
 *
 * Default Constructor example
 *
 * @author Joosep Korela
 */
public class Traffic {
    public static void main(String[] args) {
        Car car= new Car();
        car.name = "Audi Q7";   //Garbage collection

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Ford Mustang";

        car.name = "Toyota Rav 4";


        Car car4 = car2;


        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc();
    }
}
