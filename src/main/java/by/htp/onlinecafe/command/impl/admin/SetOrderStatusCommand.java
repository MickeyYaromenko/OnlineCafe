package by.htp.onlinecafe.command.impl.admin;

import by.htp.onlinecafe.command.Command;
import by.htp.onlinecafe.entity.DTO.OrderTO;
import by.htp.onlinecafe.service.Exception.ServiceException;
import by.htp.onlinecafe.service.Impl.OrderServiceImpl;
import by.htp.onlinecafe.service.OrderService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SetOrderStatusCommand implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/WEB-INF/jsp/admin/order_management.jsp";
        Integer orderID = Integer.parseInt(request.getParameter("orderID"));
        String status = request.getParameter("status");
        OrderService orderService = OrderServiceImpl.getInstance();
        try {
            orderService.setStatus(orderID, status);
            List<OrderTO> orderTOList = orderService.showActive();
            request.setAttribute("order_list", orderTOList);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return page;
    }
}
