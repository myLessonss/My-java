public class Loan {
    private int loanId;
    private double requestedAmount;
    private double approvedAmount;
    
    public Loan() {
        
    }
    public Loan(int loanId, double requestedAmount, double approvedAmount) {
        this.loanId = loanId;
        this.requestedAmount = requestedAmount;
        this.approvedAmount = approvedAmount;
    }
    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    public void setRequestedAmount(double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
    public void setApprovedAmount(double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }
    public int getLoanId() {
        return loanId;
    }
    public double getRequestedAmount() {
        return requestedAmount;
    }
    public double getApprovedAmount() {
        return approvedAmount;
    }

    

}