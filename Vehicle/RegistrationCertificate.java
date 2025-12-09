public class RegistrationCertificate {
    private String certificateId,vehicleId,issueDate,expiryDate,status,issuedBy;
    //Constructors

    public RegistrationCertificate(String certificateId, String vehicleId, String issueDate, String expiryDate,
            String status, String issuedBy) {
        this.certificateId = certificateId;
        this.vehicleId = vehicleId;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.status = status;
        this.issuedBy = issuedBy;
    }
    //Getters

    public String getCertificateId() {
        return certificateId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public String getIssuedBy() {
        return issuedBy;
    }
    //Setters

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
    
}
