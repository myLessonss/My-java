public class Withdraw {
    private int withdrawId;
    private double withdrawAmount;
    private double balance;
    public Withdraw(int withdrawId, double withdrawAmount, double balance) {
        this.withdrawId = withdrawId;
        this.withdrawAmount = withdrawAmount;
        this.balance = balance;
    }
    public void setWithdrawId(int withdrawId) {
        this.withdrawId = withdrawId;
    }
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getWithdrawId() {
        return withdrawId;
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(){
        if(withdrawAmount<balance && (balance-withdrawAmount)>1000){
            System.out.println("You have withdrawn "+withdrawAmount+" amount.");
            System.out.println("Your balance is: "+(balance-withdrawAmount));
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
