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
        //insuranceId unique validation
        this.insuranceId = insuranceId;
    }
    public void setVehicleId(String vehicleId) {
        if (vehicleId==null) {
            throw new IllegalArgumentException("Vehicle must exist");
        }
        this.vehicleId = vehicleId;
    }
    public void setProvider(String provider) {
        if (provider==null || provider.trim().isEmpty()) {
            throw new IllegalArgumentException("Provider must not be Empty");
        }
        this.provider = provider;
    }
    public void setValidFrom(String validFrom) {
        //Valid validation
        this.validFrom = validFrom;
    }
    public void setValidTo(String validTo){
        //Valid validation
        this.validTo=validTo;
    }
    public void setPremiumAmount(float premiumAmount) {
        if (!(premiumAmount>0)) {
            throw new IllegalArgumentException("Premium Amount must be Greater than 0");
        }
        this.premiumAmount = premiumAmount;
    }
    
}
