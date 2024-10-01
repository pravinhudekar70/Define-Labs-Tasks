import java.util.List;

public class TaxGroup {
    private List<Taxs> taxes;

    public TaxGroup(List<Taxs> taxes) {
        this.taxes = taxes;
    }

    public List<Taxs> getTaxes() {
        return taxes;
    }

    public double getTotalTaxPercentage() {
        double totalTax = 0.0;
        for (Taxs tax : taxes) {
            totalTax = totalTax + tax.getPercentage();
        }
        return totalTax;
    }
    
}
