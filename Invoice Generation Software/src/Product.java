public class Product {
    private String name;
    private double price;
    private TaxGroup taxGroup;

    public Product(String name, double price, TaxGroup taxGroup) {
        this.name = name;
        this.price = price;
        this.taxGroup = taxGroup;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public TaxGroup getTaxGroup() {
        return taxGroup;
    }

    public double getTaxAmount() {
        return price * (taxGroup.getTotalTaxPercentage() / 100);
    }

    public double getTotalPrice() {
        return price + getTaxAmount();
    }
}
