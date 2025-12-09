public class Insurance {
    private String insuranceId,vehicleId,provider,validFrom,validTo;
    private float premiumAmount;
    //constructors
    public Insurance(String insuranceId, String vehicleId, String provider,
         String validFrom,String validTo, float premiumAmount) {
        this.insuranceId = insuranceId;
        this.vehicleId = vehicleId;
        this.provider = provider;
        this.validFrom = validFrom;
        this.validTo=validTo;
        this.premiumAmount = premiumAmount;
    }
    //Getters
    public String getInsuranceId() {
        return insuranceId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getProvider() {
        return provider;
    }
    public String getValidFrom() {
        return validFrom;
    }
    public String getValidTo(){
        return validTo;
    }
    public float getPremiumAmount() {
        return premiumAmount;
    }
    //Setters
    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
    public void setValidTo(String validTo){
        this.validTo=validTo;
    }
    public void setPremiumAmount(float premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    
}
