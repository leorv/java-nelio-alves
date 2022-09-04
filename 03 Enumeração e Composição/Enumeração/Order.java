import java.util.Date;

import enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() {

    }

    public Order(Integer id, Date moment, OrderStatus status) {
        // super();
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Date return the moment
     */
    public Date getMoment() {
        return moment;
    }

    /**
     * @param moment the moment to set
     */
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    /**
     * @return OrderStatus return the status
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }


}
