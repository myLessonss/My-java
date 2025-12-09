public class Penalty {
    private String penaltyId,violationId,dueDate,paymentStatus,issuedDate;
    private float amount;
    //Constructors
    public Penalty(String penaltyId, String violationId, String dueDate, 
        String paymentStatus, String issuedDate,
            float amount) {
        this.penaltyId = penaltyId;
        this.violationId = violationId;
        this.dueDate = dueDate;
        this.paymentStatus = paymentStatus;
        this.issuedDate = issuedDate;
        this.amount = amount;
    }
    //Getters
    public String getPenaltyId() {
        return penaltyId;
    }
    public String getViolationId() {
        return violationId;
    }
    public String getDueDate() {
        return dueDate;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public String getIssuedDate() {
        return issuedDate;
    }
    public float getAmount() {
        return amount;
    }
    //Setters
    public void setPenaltyId(String penaltyId) {
        this.penaltyId = penaltyId;
    }
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
