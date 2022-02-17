public class CheckingAccount extends Account{
    private double limit;

    // Constructors
    public CheckingAccount() {

    }

    // Methods
    public void setLimit(double limit) {
        this.limit = limit;
    }


    public void withdraw(double amount) {
        if (this.getBalance() - amount >= -1 * this.limit) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}
