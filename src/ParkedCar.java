public class ParkedCar {

    private String  carMake;
    private String  carModel;
    private String carColor;
    private String lisenceNumber;
    private int minutesParkedFor;


    public ParkedCar(String make, String model, String color, String lisence, int minutes) {
        this.carMake = make;
        this.carModel = model;
        this.carColor = color;
        this.lisenceNumber = lisence;
        this.minutesParkedFor = minutes;
    }

    public String getCarMake() {
        return this.carMake;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public String getlisenceNumber() {
        return this.lisenceNumber;
    }

    public int getMinutesParkedFor() {
        return this.minutesParkedFor;
    }
}
