package App.Lesson.Classes.Helper;

public class Car extends Vehicle {

    private String model = "Fiesta";
    private Vehicle otherbrand;

    void Car(Vehicle brand) {
        otherbrand = brand;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        Vehicle myVehicle = new Vehicle();
        myCar.Car(myVehicle);

        myCar.run();
        System.out.println("My car is " + myCar.model + " and brand from " + myCar.brand + " not " + myCar.myVehicle());
    }

    String myVehicle() {
        return otherbrand.getOtherbrand();
    }


}
