public class Car {

    public static final String brand = "Seat";
    public static String model;
    public final int potency;

    public Car(int potencia) { // You only can initialize the potency attribute because it´s the only one who is not static.
        this.potency = potencia;
    }

    public static String brake() {
        return "The car is braking";
    }

    public String accelerate() {
        return "The car is accelerating";
    }
}
