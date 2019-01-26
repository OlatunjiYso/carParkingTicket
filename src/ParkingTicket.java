public class ParkingTicket {

    private ParkedCar car;
    private String officerName;
    private String officerBadge;

    public ParkingTicket(ParkedCar foundCar, String officerName, String officerBadge) {
        this.car = foundCar;
        this.officerName = officerName;
        this.officerBadge = officerBadge;
    }


    public String getOfficerNameAndBadge() {
        String nameAndBadge = "Officer " + this.officerName + " with badge number " + this.officerBadge  ;
        return nameAndBadge;
    }


    public String getFine(int timePurchased) {
        int fine = 0;
        String message;
        int minutesSpent = this.car.getMinutesParkedFor();
        int overtime = minutesSpent - timePurchased;
        if(overtime <= 60) {
            fine = 25;
            message = getOfficerNameAndBadge() + " has fined you $" + fine;
        } else {
            double remainingTime = overtime - 60.0;
            double multiplier = Math.ceil(remainingTime / 60.0);
            fine = (10 * (int) multiplier) + 25;
            message = getOfficerNameAndBadge() + " has fined you $" + fine;

        }
        return message;
    }
}
