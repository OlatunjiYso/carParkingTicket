public class PoliceOfficer {

    private String name;
    private String badge;

    public PoliceOfficer(String name, String badge) {
        this.name = name;
        this.badge = badge;
    }

    public String getName() {
        return name;
    }

    public String getBadge() {
        return badge;
    }

    public boolean determineExpired(ParkedCar foundCar, ParkingMeter meter) {
        return foundCar.getMinutesParkedFor() > meter.getMinutesPurchased();
    }

    public String issueTicket(ParkedCar foundCar, ParkingMeter meter) {
        if (determineExpired(foundCar,  meter)) {

            String name = this.getName();
            String badge = this.getBadge();

            ParkingTicket ticket = new ParkingTicket(foundCar, name, badge);
            int timePurchased = meter.getMinutesPurchased();
            String message = ticket.getFine(timePurchased );
            return message;
        } else {

            return "You are not fined, Enjoy!!";
        }
    }
}
