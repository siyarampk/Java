public class Car {

    String model;
    String color;
    int horsePower;
    static final byte No_Of_Wheel = 4;
    static byte noOfEngines;

    static {
        noOfEngines=1;
        System.out.println("static blocking is being executed");
    }

    {
        System.out.println("Car object is being created...");
    }

    public Car() {

    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void startCar() {
        System.out.printf("Vechicle started....");
    }

    public String stopCar() {
        String output = "Vechicle stopped";
        return output;
    }
}
