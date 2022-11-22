package entities;

public class OutSourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutSourcedEmployee() {
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    /**
     * @return Double return the additionalCharge
     */
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * @param additionalCharge the additionalCharge to set
     */
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + 1.1 * additionalCharge;
    }

}
