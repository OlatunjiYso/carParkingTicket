public class Car {

    private Person owner;
    private License license;
    private String color;
    private String make;
    private String model;


    public Car(Person carOwner, License carLicense, String color, String make, String model) {
        this.owner = carOwner;
        this.license = carLicense;
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public License getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    private void setOwner(Person newOwner) {
        this.owner = newOwner;
    }

    private void setColor(String newColor) {
        this.color = newColor;
    }

    public ParkedCar park() {
        ParkedCar parkedCar = new ParkedCar(
                this.getMake(),
                this.getModel(),
                this.getColor(),
                this.getLicense().getLicenseNumber()
                );

        return parkedCar;
    }
}
