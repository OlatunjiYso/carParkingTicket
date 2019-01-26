public class Demo {

    public static void main( String[] args) {

        ParkedCar yourCar = new ParkedCar("Camry", "2018A", "white", "123adb", 1800);

        ParkingMeter meter = new ParkingMeter(16000);

        PoliceOfficer officer = new PoliceOfficer("John Doe", "AAA87654");

        String yourTicket = officer.issueTicket(yourCar, meter);


        System.out.println(yourTicket);
    }
}
