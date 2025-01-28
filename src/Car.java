public class Car {

    public static final String BRAND = "Seat";
    public static String model;
    public final int POTENCY;

    public Car(int potencia) { // You only can initialize the potency attribute because it´s the only one who is not static.
        this.POTENCY = potencia;
    }

    public static String brake() {
        return "The car is braking";
    }

    public String accelerate() {
        return "The car is accelerating";
    }
}
