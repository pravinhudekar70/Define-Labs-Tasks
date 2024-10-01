import java.util.List;

class Invoice {
    private List<Product> products;

    public Invoice(List<Product> products) {
        this.products = products;
    }

    public void generateInvoice() {
        double totalPrice = 0;
        double totalTax = 0;

        System.out.println("----------------------------");
        System.out.println("Product \tPrice \tTax");

        for (Product product : products) {
            double price = product.getPrice();
            double tax = product.getTaxAmount();

            System.out.println(product.getName()+"\t\t"+price +"\t"+ tax);
            totalPrice += price;
            totalTax += tax;
        }

        System.out.println("----------------------------");
        System.out.println("Total\t\t" + totalPrice+"\t "+totalTax);
        System.out.println("Grand Total  : "+ (totalPrice + totalTax));
        System.out.println("----------------------------");
    }
}
