public class Main {
    public static void main(String[] args) {
        OrderCalculator orderCalculator = new OrderCalculationService();
        OrderPlacer orderPlacer = new OrderPlacementService();
        InvoiceGenerator invoiceGenerator = new PDFInvoiceGenerator();
        EmailNotifier emailNotifier = new EmailService();

        OrderProcessor orderProcessor = new OrderProcessor(orderCalculator, orderPlacer, invoiceGenerator, emailNotifier);
        orderProcessor.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}