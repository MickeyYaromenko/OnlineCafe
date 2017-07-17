package by.htp.onlinecafe.service;

import by.htp.onlinecafe.entity.Bill;
import by.htp.onlinecafe.entity.Client;
import by.htp.onlinecafe.service.exception.ServiceException;

import java.util.List;

public interface BillService {
    List<Bill> clientHistory(Client client) throws ServiceException;
    List<Bill> allHistory();
}
