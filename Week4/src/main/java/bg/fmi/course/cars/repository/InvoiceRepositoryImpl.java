package bg.fmi.course.cars.repository;

import bg.fmi.course.cars.model.Invoice;

import java.util.ArrayList;
import java.util.List;
public class InvoiceRepository {
    private List<Invoice> invoiceRepository;

    public InvoiceRepository(){
        invoiceRepository = new ArrayList<Invoice>();
    }

    public void addInvoice(Invoice invoice){
        invoiceRepository.add(invoice);
    }

    public List<Invoice> getInvoiceHistory(){
        return invoiceRepository;
    }

}