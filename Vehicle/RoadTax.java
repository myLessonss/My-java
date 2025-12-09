public class RoadTax {
    private String taxId,vehicleId,validFrom,validTo,status;
    private float amount;
    //Constructors
    public RoadTax(String taxId, String vehicleId, String validFrom, String validTo,
         String status, float amount) {
        this.taxId = taxId;
        this.vehicleId = vehicleId;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.status = status;
        this.amount = amount;
    }
    //Getters
    public String getTaxId() {
        return taxId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getValidFrom() {
        return validFrom;
    }
    public String getValidTo() {
        return validTo;
    }
    public String getStatus() {
        return status;
    }
    public float getAmount() {
        return amount;
    }
    //Setters
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
