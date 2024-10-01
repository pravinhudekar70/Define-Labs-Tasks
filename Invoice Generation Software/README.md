# Invoice Generation Software

This Java-based Invoice Generation Software calculates and applies various taxes on different product categories. The program generates an invoice showing product prices, tax amounts, and the total payable amount including taxes.

## Features

- **Tax Structure:** Create and store multiple taxes with different percentages.
- **Tax Groups:** Combine individual taxes into tax groups and apply them to specific products.
- **Product Management:** Store product details like name, price, and applicable tax group.
- **Invoice Generation:** Calculate total tax and price for products and generate a detailed invoice.

## Example

Assume you have two products:

- **Soap** has a price of 10 and is subject to SGST and CGST.
- **Petrol** has a price of 65 and is subject only to VAT.

The invoice generated will look like:
----------------------------
Product     Price   Tax
Soap        10.00   2.00
Petrol      65.00   1.30
----------------------------
Total       75.00   3.30
Grand Total  : 78.30
---------------------------- 

## Example Code
#java
// Create individual taxes...
Tax vat = new Tax("VAT", 2);
Tax sgst = new Tax("SGST", 1);
Tax cgst = new Tax("CGST", 1);

// Create tax groups....
TaxGroup noTax = new TaxGroup(Arrays.asList());
TaxGroup vatOnly = new TaxGroup(Arrays.asList(vat));
TaxGroup sgstCgst = new TaxGroup(Arrays.asList(sgst, cgst));

// Create products....
Product soap = new Product("Soap", 10, sgstCgst);
Product petrol = new Product("Petrol", 65, vatOnly);

// Create invoice and generate output....
Invoice invoice = new Invoice(Arrays.asList(soap, petrol));
invoice.generateInvoice();
