package by.htp.onlinecafe.command.impl.client;

import by.htp.onlinecafe.command.Command;

import javax.servlet.http.HttpServletRequest;

public class OpenOrderPageCommand implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/WEB-INF/jsp/order.jsp";
        return page;
    }
}