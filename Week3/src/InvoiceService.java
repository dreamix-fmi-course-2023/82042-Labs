import java.util.List;

public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    InvoiceService() {
        invoiceRepository = new InvoiceRepository();
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.addInvoice(invoice);
    }

    public List<Invoice> getInvoiceHistory() {
        return invoiceRepository.getInvoiceHistory();
    }

    public double calculateTotalPrice(Invoice invoice) {
        return invoice.getTotalPrice();
    }
}
