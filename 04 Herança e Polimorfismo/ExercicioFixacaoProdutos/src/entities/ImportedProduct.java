package entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }    

    /**
     * @return double return the customsFee
     */
    public double getCustomsFee() {
        return customsFee;
    }

    /**
     * @param customsFee the customsFee to set
     */
    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public void priceTag() {
        System.out.printf("%s, $%.2f (custom fee: $%.2f)\n",this.getName(), totalPrice(), customsFee);
    }

    public double totalPrice() {
        double totalPrice = this.getPrice() + customsFee;
        return totalPrice;
    }


}
