public class Violation {
    private String violationId,vehicleId,violationType,date,officerId;
    private float fineAmount;
    //Constructors
    public Violation(String violationId, String vehicleId, String violationType, String date, String officerId,
            float fineAmount) {
        this.violationId = violationId;
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.date = date;
        this.officerId = officerId;
        this.fineAmount = fineAmount;
    }
    //Getters
    public String getViolationId() {
        return violationId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getViolationType() {
        return violationType;
    }
    public String getDate() {
        return date;
    }
    public String getOfficerId() {
        return officerId;
    }
    public float getFineAmount() {
        return fineAmount;
    }
    //Setters
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }
    public void setFineAmount(float fineAmount) {
        this.fineAmount = fineAmount;
    }
    
}
