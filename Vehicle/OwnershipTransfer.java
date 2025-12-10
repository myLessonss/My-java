public class OwnershipTransfer {
    private String transferId,vehicleId,oldOwnerId,newOwnerId,transferDate;
    private float fee;
    //Constructors
    public OwnershipTransfer(String transferId, String vehicleId, String oldOwnerId, String newOwnerId,
            String transferDate, float fee) {
        this.transferId = transferId;
        this.vehicleId = vehicleId;
        this.oldOwnerId = oldOwnerId;
        this.newOwnerId = newOwnerId;
        this.transferDate = transferDate;
        this.fee = fee;
    }
    //Getters
    public String getTransferId() {
        return transferId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getOldOwnerId() {
        return oldOwnerId;
    }
    public String getNewOwnerId() {
        return newOwnerId;
    }
    public String getTransferDate() {
        return transferDate;
    }
    public float getFee() {
        return fee;
    }
    //Setters
    public void setTransferId(String transferId) {
        //transferId must be unique validation
        this.transferId = transferId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setOldOwnerId(String oldOwnerId) {
        this.oldOwnerId = oldOwnerId;
    }
    public void setNewOwnerId(String newOwnerId) {
        if (newOwnerId!=oldOwnerId) {
            throw new IllegalArgumentException("New owner must not be equal to old");
        }
        //Age of owner validation
        this.newOwnerId = newOwnerId;
    }
    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
    public void setFee(float fee) {
        if (!(fee>0)) {
            throw new IllegalArgumentException("Fee must be Greater than 0");
        }
        this.fee = fee;
    }
    
}
