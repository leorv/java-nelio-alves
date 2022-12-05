package entities;

import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    /**
     * @return LocalDate return the manufactureDate
     */
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    /**
     * @param manufactureDate the manufactureDate to set
     */
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public void priceTag() {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(this.getName() + " (used) "
            + "$" + String.format("%.2f", this.getPrice())
            + " (Manufacture date: " + getManufactureDate().format(fmt1)
            + ")"
            );
    }

}
