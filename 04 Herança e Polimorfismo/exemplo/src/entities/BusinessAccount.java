package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String houder, Double balance, Double loanLimit) {
        super(number, houder, balance);
        this.loanLimit = loanLimit;
    }

    /**
     * @return Double return the loanLimit
     */
    public Double getLoanLimit() {
        return loanLimit;
    }

    /**
     * @param loanLimit the loanLimit to set
     */
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

}
