public class Main {
    public static void main(String[] args) {

        Car carOne = new Car(150);

        System.out.println(carOne.accelerate()); // you can use the method from the carOne object.
        System.out.println(Car.brake()); // you need tho use the method from the class because it's a static method.
    }
}