import java.util.Date;

public class License {
    Date issueDate;
    Date expiryDate;
    Person bearer;
    String licenseNumber;

    public License(Date issueDate, Date expiryDate, Person bearer, String licenseNumber) {
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.bearer = bearer;
        this.licenseNumber = licenseNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Person getBearer() {
        return bearer;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    private void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    private void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean licenseIsValid() {
        Date presentDate = new Date();
        Date expiryDate = this.getExpiryDate();
        return expiryDate.before(presentDate);
    }

    public void renewLicense() {
        Date presentDate = new Date();
        long timeInTwoYears = presentDate.getTime() + 2*365*24*60*60*1000;
        Date dateInTwoYears = new Date(timeInTwoYears);
        setIssueDate(presentDate);
        setExpiryDate(dateInTwoYears);
    }
}
