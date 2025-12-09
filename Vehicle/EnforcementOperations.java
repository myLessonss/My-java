public interface EnforcementOperations {
    public void recordViolation();
    public void suspendRegistration();
    public void blacklistVehicle();
    public void verifyDocuments();
    public void calculatePenalty();
    public void generateEnforcementReport();
}
