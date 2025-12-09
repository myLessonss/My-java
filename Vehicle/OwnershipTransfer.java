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
        this.transferId = transferId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setOldOwnerId(String oldOwnerId) {
        this.oldOwnerId = oldOwnerId;
    }
    public void setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
    }
    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
    public void setFee(float fee) {
        this.fee = fee;
    }
    
}
