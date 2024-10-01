
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Taxs vat = new Taxs("VAT", 2);
        Taxs sgst = new Taxs("SGST", 10);
        Taxs cgst = new Taxs("CGST", 10);

        TaxGroup noTax = new TaxGroup(Arrays.asList());
        TaxGroup vatOnly = new TaxGroup(Arrays.asList(vat));
        TaxGroup sgstCgst = new TaxGroup(Arrays.asList(sgst, cgst));

        Product rice = new Product("Rice", 50, noTax);
        Product soap = new Product("Soap", 10, sgstCgst);
        Product petrol = new Product("Petrol", 65, vatOnly);

        Invoice invoice = new Invoice(Arrays.asList(rice, soap, petrol));
        invoice.generateInvoice();
    }
}
