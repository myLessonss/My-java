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
        if (vehicleId==null) {
            throw new IllegalArgumentException("Vehicle must Exist.");
        }
        this.vehicleId = vehicleId;
    }
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
    public void setValidTo(String validTo) {
        //validTo>validFrom
        this.validTo = validTo;
    }
    public void setStatus(String status) {
        if (status=="Active" || status=="Expired" ||status=="Pending") {
            throw new IllegalArgumentException("Status must be: Active/Expired/Pending");
        }
        this.status = status;
    }
    public void setAmount(float amount) {
        if (!(amount>0)) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        this.amount = amount;
    }
    
    
}
