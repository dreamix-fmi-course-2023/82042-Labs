package bg.fmi.course.cars.repository;

import bg.fmi.course.cars.model.Invoice;

import java.util.ArrayList;
import java.util.List;
public class InvoiceRepositoryImpl implements InvoiceRepository {
    private List<Invoice> invoiceRepository;

    public InvoiceRepositoryImpl(){
        invoiceRepository = new ArrayList<Invoice>();
    }
    @Override
    public void addInvoice(Invoice invoice){
        invoiceRepository.add(invoice);
    }
    @Override
    public List<Invoice> getInvoiceHistory(){
        return invoiceRepository;
    }

}