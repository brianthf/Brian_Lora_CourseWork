package com.company.BrianLoraU1Capstone.service;

import com.company.BrianLoraU1Capstone.dao.ConsoleDao;
import com.company.BrianLoraU1Capstone.dao.GameDao;
import com.company.BrianLoraU1Capstone.dao.InvoiceDao;
import com.company.BrianLoraU1Capstone.dao.TShirtDao;

import com.company.BrianLoraU1Capstone.model.Invoice;
import com.company.BrianLoraU1Capstone.viewmodel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvoiceService {
    GameDao gameDao;
    TShirtDao tShirtDao;
    ConsoleDao consoleDao;
    InvoiceDao invoiceDao;

    @Autowired
    public InvoiceService(GameDao gameDao, TShirtDao tShirtDao, ConsoleDao consoleDao, InvoiceDao invoiceDao) {
        this.gameDao = gameDao;
        this.tShirtDao = tShirtDao;
        this.consoleDao = consoleDao;
        this.invoiceDao = invoiceDao;
    }

    private InvoiceViewModel buildInvoiceViewModel(Invoice invoice) {
        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();
        invoiceViewModel.setId(invoice.getInvoiceId());
        invoiceViewModel.setName(invoice.getName());
        invoiceViewModel.setItemType(invoice.getItemType());
        invoiceViewModel.setItemId(invoice.getItemId());
        invoiceViewModel.setQuantity(invoice.getQuantity());
        invoiceViewModel.setSubTotal(invoice.getSubTotal());
        invoiceViewModel.setTax(invoice.getTax());
        invoiceViewModel.setProcessingFee(invoice.getProcessingFee());
        invoiceViewModel.setTotal(invoice.getTotal());

        return invoiceViewModel;
    }
}
