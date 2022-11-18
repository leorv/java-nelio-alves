package entities;

public class Account {
    private Integer number;
    private String houder;
    protected void name() {
        
    } Double balance;

    public Account() {
    }

    public Account(Integer number, String houder, Double balance) {
        this.number = number;
        this.houder = houder;
        this.balance = balance;
    }

    /**
     * @return Integer return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return String return the houder
     */
    public String getHouder() {
        return houder;
    }

    /**
     * @param houder the houder to set
     */
    public void setHouder(String houder) {
        this.houder = houder;
    }

    /**
     * @return Double return the balance
     */
    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

}
